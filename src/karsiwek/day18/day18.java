package karsiwek.day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import kotlin.Pair;
import kotlin.ranges.IntRange;

public class day18 {

  private static String input2 = ".#.#...|#.\n" +
      ".....#|##|\n" +
      ".|..|...#.\n" +
      "..|#.....#\n" +
      "#.#|||#|#|\n" +
      "...#.||...\n" +
      ".|....|...\n" +
      "||...#|.#|\n" +
      "|.||||..|.\n" +
      "...#.|..|.";

  private static String input = "..##|#.##..|#...|.#|....#|.#......|#......#|....|.\n" +
      "..#|.#.#|..#.|...|.|.|....|..|||||..#|..#.#..|##.|\n" +
      ".||.....#..#.....|||#|.....#|###|||.|..#...#..|##.\n" +
      "#|...|#|.......##.|......####.|..||#....##||.#...#\n" +
      "..|.##|#.|.#||#....#||...|#.||.|....|.|#|.#...#.#.\n" +
      "#..|......#..#....|||.||..#..#..#.|.|.|#.||.....#.\n" +
      "|.|...#|..|#|.|....#...#.|.#||.....#........||..|.\n" +
      ".#|##.|...|......|.#||#|#..|.|....|....|||...#####\n" +
      ".|.......#....##|.#.#...|.||.....#|.|#.......|##|.\n" +
      ".#....#|##|..##|..#.|...##.|#.##..#.......||.|.|##\n" +
      "###..#||........#...#..#..|......||.......#.|#|#..\n" +
      ".||.#.....|.#...|......#.||##||......|...||.||....\n" +
      "..#|.|....#.#.|||#...#.....#.#.#.|....#.|...|#....\n" +
      "#...|..#.|.|...#|..#.|#...|.......#.|.......|.###.\n" +
      ".|#|.#.|..#|....|..|..#..#|......#..#..|.#...|.|#.\n" +
      ".#...#......#|||..|.|.....#....|#.||.....#||##..|.\n" +
      "|.|...#||..|........#.....|#....|...||..##.#.#.|..\n" +
      ".....|......######|...|.....##.........|#|.#|.....\n" +
      "|..|.......|#|.##.|..|....#....##..||..|...|..|...\n" +
      ".||||#....|..|.|#|..|...#.|#.|.....|.||.||#...|...\n" +
      ".#|#..###.#|....#..||...|##..#.#|..#..|||........#\n" +
      "..|.#.....#|..|.#..|...#||......##.|....|.|#.|.|||\n" +
      "..#.......|#||..|...|.....##..#.#.####..|......#|#\n" +
      ".|##......|#....|..|.||...##|#....##||#.#|#.#..#.|\n" +
      "#..#..|..#....|..|....##..|..#....##.#|#|##|#|....\n" +
      "|####..#....|..|..|....|#.|....|.....##.##.#|....|\n" +
      "..||...##..|...#|##..|.##......#...##.|....#.|...#\n" +
      ".#...|#.|#|.....|#|....##.|.........|.......|.#...\n" +
      "||...###...|#..###|..|.#.|#||...#...#|.....|##|..|\n" +
      "#.#.#|....#|#..|..........|#..#|.|#||...|##.##.|#.\n" +
      "....|.##..#...#..##|..|....|..||#.|..|..#..#......\n" +
      ".|.#..|.#...||..#..|.|...#....|.||#.|#.....||.|...\n" +
      "..#|||.#..|#|...||#.|....|.#...#||||#...#...|...|#\n" +
      "..#..#....#|.............##...|..#..#..||##|..#.||\n" +
      "#....#|...#..##....###..||..#||...|.#..|.....|....\n" +
      "....|..#...#...||..||....|#|#|.|..|.#.|..|.##..|#.\n" +
      "..#.....|....||.##..#..#|..|.|#.....|...|..|..#..#\n" +
      ".##.||.#||..#|.#....||.|.....#|.....#....||..#.##|\n" +
      "..|.#|.|...|........#......|.##.|#.#..|......##...\n" +
      ".##||.|.##....|...##.#.....#.##.##..#...|||#|#.|.|\n" +
      "....|||..|....#..#.#..|.|.|....#.|#.#.##|.|#.#|.#.\n" +
      "..|...#|#....##.#|##.#.||##...#.|#..##.....#...#..\n" +
      ".|#..#.....|...|.#..##......|..#.|.......#.....#..\n" +
      ".#..|.#..|#...#....|..||.|..#..#...##........#....\n" +
      ".|.##.#|.#.#.|..||##|..||||.##|||..#..##...|..#|#.\n" +
      "#.......#...|#.|#||..|.##...#...|....|...##....#.|\n" +
      ".###..|......||#...|..||||#....|.||...#....|.#...|\n" +
      ".|.#...|#..|.....#......|.......|.........|.#.#...\n" +
      "|.|...#...|#|||...|||....|#..|#...#.#..#...|....#|\n" +
      "|#...#..#.|#|.#..#.#.....|.|.##...#.|#..|.#|..#...";

  private char[][] area;

  private void solve(String input) {
    area = new char[input.split("\n").length][];
    List<Integer> results = new ArrayList<>();
    for(int i=0;i<input.split("\n").length;i++){
      area[i]=input.split("\n")[i].trim().toCharArray();
    }

    int rounds = 0;

    while(rounds++<1000000000){
      final char[][] newArea = new char[area.length][];

      for(int i=0;i<area.length;i++){
        newArea[i] = new char[area[i].length];

        for(int j=0;j<area[i].length;j++){
          final int finalI = i;
          final int finalJ = j;
          final Map<Character, Integer> neighbours =
              IntStream.range(i-1, i+2).mapToObj(x-> (Integer) x).flatMap(x -> IntStream.range(finalJ-1, finalJ+2).mapToObj(y-> (Pair<Integer, Integer>) new Pair(x,y)))
              .filter(
                  pair -> !(pair.component1()==finalI && pair.component2()==finalJ)
                      && pair.component1() >= 0 && pair.component1() < area.length && pair.component2() >= 0
                      && pair.component2() < area[finalI].length)
              .collect(Collectors.toMap(x -> area[x.component1()][x.component2()], x -> 1, (a, b) -> a + b));

          switch(area[i][j]){
            case '.':
              if(neighbours.getOrDefault('|', 0)>=3){
                newArea[i][j] = '|';
              } else {
                newArea[i][j]='.';
              }
              break;
            case '|':
              if(neighbours.getOrDefault('#', 0)>=3){
                newArea[i][j] = '#';
              } else {
                newArea[i][j]='|';
              }
              break;
            case '#':
              if(neighbours.getOrDefault('#', 0)>=1 && neighbours.getOrDefault('|', 0)>=1){
                newArea[i][j] = '#';
              } else {
                newArea[i][j]='.';
              }
              break;
            default:
              newArea[i][j]=area[i][j];
          }

        }
      }
      System.out.println(getHash(newArea));
      System.out.println(results.size());
      if(results.contains(getHash(newArea))){

        System.out.println("repetition!");
        System.out.println(results.indexOf(getHash(newArea)));
        System.out.println(results.size());

        int leftIterations = 1000000000 - rounds;
        int cycleSize = results.size() - results.indexOf(getHash(newArea));
        int leftWholeCycles = leftIterations / cycleSize;

        rounds+=leftWholeCycles*cycleSize;
        results.clear();


      }
      results.add(getHash(newArea));
      for(int i=0;i<newArea.length;i++){
        for(int j=0;j<newArea[i].length;j++){
          area[i][j] = newArea[i][j];
        }
      }
      System.out.println();
      System.out.println();
      for(int i=0;i<area.length;i++){
       // System.out.println(new String(area[i]));
      }


    }
     int trees = 0;
     int lumbers = 0;
    for(int i=0;i<area.length;i++){
      for(int j=0;j<area[i].length;j++){

        switch(area[i][j]) {
          case '|':
            trees++;
            break;
            case '#':
              lumbers++;
              break;
        }
      }
    }
    System.out.println(trees*lumbers);
  }

  private static int getHash(final char[][] b) {
    return Arrays.stream(b).map(it ->it==null? "" : new String(it)).reduce((x, y) -> x + y).get().hashCode();
  }

  public static void main(String[] args) {

    new day18().solve(input);

  }


}


//26915 too high
//26915