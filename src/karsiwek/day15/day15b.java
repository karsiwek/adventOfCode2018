package karsiwek.day15;

import static karsiwek.day15.day15.inputMarines;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

import kotlin.Pair;

public class day15b {

  private char[][] data;

  private static String input =
      "################################\n" +
      "###############G.G.#############\n" +
      "###############...G#############\n" +
      "##############.....#############\n" +
      "#############.G....#############\n" +
      "############.......#############\n" +
      "###########...##################\n" +
      "###########G.###################\n" +
      "#########....###################\n" +
      "##########..####################\n" +
      "##########G.###########...######\n" +
      "###########.G.G.......#....#####\n" +
      "###########...#####...#....#####\n" +
      "###########..#######..G.....##.#\n" +
      "###########.#########..........#\n" +
      "######..###.#########.G.#.....##\n" +
      "#####....#..#########....#######\n" +
      "#####.......#########..#.##..###\n" +
      "###..##.....#########..#.......#\n" +
      "###..........#######...........#\n" +
      "##..GG........#####G.......E...#\n" +
      "#...#....G...........G.......E.#\n" +
      "###.#...............E.EE.......#\n" +
      "###..............G#E......E...##\n" +
      "##.....G............#.....E..###\n" +
      "#.G........G..............E..###\n" +
      "#.#.....######.......E.......###\n" +
      "##...G...#####....#..#.#..######\n" +
      "#####..#...###....######..######\n" +
      "#####.......##..########..######\n" +
      "######....#.###########...######\n" +
      "################################";
  private static String input0=
      "#########\n" +
          "#G..G..G#\n" +
          "#.......#\n" +
          "#.......#\n" +
          "#G..E..G#\n" +
          "#.......#\n" +
          "#.......#\n" +
          "#G..G..G#\n" +
          "#########";

  private static String input1 =
          "#######   \n" +
          "#.G...#\n" +
          "#...EG# \n" +
          "#.#.#G#\n" +
          "#..G#E#\n" +
          "#.....#\n" +
          "####### ";

  private static String input2 =
      "#######\n" +
          "#E..G.#\n" +
          "#...#.#\n" +
          "#.G.#G#\n" +
          "#######";

  private static String input3 =
      "#######\n" +
          "#EG.G.#\n" +
          "#...#.#\n" +
          "#.G.#G#\n" +
          "#######";

  private static String input4 =
      "#######\n" +
          "#EG...#\n" +
          "#G..#.#\n" +
          "#...#.#\n" +
          "#######";

  private static String input5 =
      "#######\n" +
          "#E..G.#\n" +
          "#######";

  private static String input6 =
      "#######\n" +
          "#.....#\n" +
          "#...#.#\n" +
          "#..G#E#\n" +
          "#######";

  private static String eg1=
      "####### \n" +
          "#G..#E#      \n" +
          "#E#E.E# \n" +
          "#G.##.# \n" +
          "#...#E# \n" +
          "#...E.#  \n" +
          "#######";

  private static String eg1_0=
          "####### \n" +
          "#...#.#      \n" +
          "#E#...# \n" +
          "#GE##.# \n" +
          "#E..#.# \n" +
          "#.....#  \n" +
          "#######";

  private static String eg2 =
      "#######   \n" +
          "#E..EG# \n" +
          "#.#G.E#  \n" +
          "#E.##E# \n" +
          "#G..#.# \n" +
          "#..E#.#  \n" +
          "#######";

  private static String eg3 =
  "#######     \n"+
      "#E.G#.#   \n"+
      "#.#G..#  \n"+
      "#G.#.G#  \n"+
      "#G..#.#  \n"+
      "#...E.#  \n"+
      "#######";

  private static String eg4 =
      "#######   \n" +
          "#.E...#    \n" +
          "#.#..G# \n" +
          "#.###.#  \n" +
          "#E#G#G#   \n" +
          "#...#G#  \n" +
          "#######    ";

  private static String eg5 =
      "#########     \n" +
          "#G......#    \n" +
          "#.E.#...#   \n" +
          "#..##..G#   \n" +
          "#...##..#  \n" +
          "#...#...# \n" +
          "#.G...G.#      \n" +
          "#.....G.#     \n" +
          "#########   ";

  private static String maze1=
          "#########\n" +
          "#E......#\n" +
          "#######.#\n" +
          "#.....#.#\n" +
          "#.###.#.#\n" +
          "#.#...#.#\n" +
          "#.#.###.#\n" +
          "#.#.....#\n" +
          "#.#######\n" +
          "#......G#\n" +
          "#########";

  private static String maze2=
          "#########\n" +
          "#E......#\n" +
          "#######.#\n" +
          "#.....#.#\n" +
          "#.###.#.#\n" +
          "#.#G#.#.#\n" +
          "#.#...#.#\n" +
          "#.#####.#\n" +
          "#.......#\n" +
          "#########";

  private static String tricky =
      "########## \n" +
          "##E#######    \n" +
          "##.####### \n" +
          "##.#G...## \n" +
          "##...##.##   \n" +
          "#######E## \n" +
          "########## ";
  private boolean solveShit(String input, int ap) {
    data = Arrays.stream(input.split("\\n")).map(line -> line.trim().toCharArray()).toArray(new IntFunction<char[][]>() {
      @Override
      public char[][] apply(final int value) {
        return new char[value][];
      }
    });

    final char[][] map = Arrays.stream(input.split("\\n")).map(line -> line.replace('G', '.').replace('E', '.').trim().toCharArray())
        .toArray(new IntFunction<char[][]>() {
          @Override
          public char[][] apply(final int value) {
            return new char[value][];
          }
        });

    char[][] currentMap = data;

    List<Unit> units = new ArrayList<>();
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data[i].length; j++) {
        if (data[i][j] == 'G' || data[i][j] == 'E') {
          units.add(new Unit(data[i][j], new Pair(j, i), data[i][j]=='G'? 3: ap ));
        }
      }
    }

    for (char[] line : currentMap) {
     // System.out.println(new String(line));
    }

    int iterations = 0;
    while (true) {
      units.forEach(a -> a.ticked = false);
      units.sort((a, b) -> {
        if (a.pos.component2() == b.pos.component2()) {
          return a.pos.component1() - b.pos.component1();
        }
        return a.pos.component2() - b.pos.component2();
      });

      for (int i = 0; i < units.size(); i++) {
        final Unit unit = units.get(i);

        // can attack?
        Unit opponentToAttack = null;
        for (Unit opponent : units) {
          if (opponent.type != unit.type && unit.isNearBy(opponent)) {
            if(opponentToAttack==null || opponentToAttack.hp > opponent.hp){
              opponentToAttack = opponent;
            }

          }
        }
        if (opponentToAttack != null) {
         // System.out.print(opponentToAttack);
         // System.out.println("attack1");
          unit.ticked = true;
          opponentToAttack.hp -= unit.ap;
          if (opponentToAttack.hp <= 0) {
            if(opponentToAttack.type == 'E') {
              return false;
            }
            units.remove(opponentToAttack);
            currentMap = updateMap(map, units);
            if (units.size() > i && unit != units.get(i)) {
              i--;
            }
          }
        } else {
          //move block
          final Pair<Integer, Integer> bestDir = getClosestOpponent(unit.type, unit.pos, currentMap);
          if(bestDir!=null){
            unit.pos = bestDir;
            unit.ticked = true;
          }
          currentMap = updateMap(map, units);
          //and then try to atack:
          opponentToAttack = null;
          for (Unit opponent : units) {
            if (opponent.type != unit.type && unit.isNearBy(opponent)) {
              if(opponentToAttack==null || opponentToAttack.hp > opponent.hp){
                opponentToAttack = opponent;
              }
            }
          }
          if (opponentToAttack != null) {
          //  System.out.print(opponentToAttack);
          //  System.out.println("attack2");
            unit.ticked = true;
            opponentToAttack.hp -= unit.ap;
            if (opponentToAttack.hp <= 0) {
              if(opponentToAttack.type == 'E') {
                return false;
              }
              units.remove(opponentToAttack);
              currentMap = updateMap(map, units);
              if (units.size() > i && unit != units.get(i)) {
                i--;
              }
            }
          }

          if(units.stream().anyMatch(other -> other.type!=unit.type)){
            unit.ticked=true;
          }

        }

      }
      currentMap = updateMap(map, units);
      for (char[] line : currentMap) {
        //System.out.println(new String(line));
      }


      if(units.stream().map(unit -> unit.type).collect(Collectors.toSet()).size()<=1){
        System.out.println(units.stream().anyMatch(unit -> !unit.ticked));
        if(!units.stream().anyMatch(unit -> !unit.ticked)){
          iterations+=1;
        }
        System.out.println(units.stream().map(unit -> unit.hp).reduce((a,b) -> a+b).get());
        ///
        System.out.println(iterations);
        System.out.println(units.stream().map(unit -> unit.hp).reduce((a,b) -> a+b).get()*iterations);
        units.stream().forEach(unit -> System.out.println(String.valueOf(unit.type) + unit.hp));
        return true;
      }
      iterations++;
    }
  }

  private Pair<Integer, Integer> getClosestOpponent(final char type, final Pair<Integer, Integer> pos, final char[][] currentMap) {
    List<Pair<Integer, Integer>> closestSorted = new ArrayList<>();
    Map<Pair<Integer, Integer>, Pair<Integer, Pair<Integer, Integer>>> results = new HashMap<>();
    results.put(pos, new Pair(Integer.MAX_VALUE, null));

    closestSorted.add(new Pair(pos.component1(), pos.component2() - 1));
    closestSorted.add(new Pair(pos.component1() - 1, pos.component2()));
    closestSorted.add(new Pair(pos.component1() + 1, pos.component2()));
    closestSorted.add(new Pair(pos.component1(), pos.component2() + 1));

    final List<Pair<Integer, Integer>> stack = new ArrayList<>(closestSorted.size());
//    Collections.copy(stack, closestSorted);
    stack.addAll(closestSorted);
    getDistances(type == 'G' ? 'E' : 'G', stack, results, currentMap);

    Pair<Integer, Integer> bestDir = null;
    int minDist = Integer.MAX_VALUE;

    closestSorted.sort((a,b) -> {
      final Integer aScore = results.get(a).component1();
      final Integer bScore = results.get(b).component1();
      final Pair<Integer, Integer> aTarget = results.get(a).component2();
      final Pair<Integer, Integer> bTarget = results.get(b).component2();
      if(aScore == bScore) {
        if (aTarget.component2() == bTarget.component2()) {
          return aTarget.component1() - bTarget.component1();
        }
        return aTarget.component2() - bTarget.component2();
      } else {
        return aScore-bScore;
      }
    });
    return results.get(closestSorted.get(0)).component1()<Integer.MAX_VALUE? closestSorted.get(0) : null;
  }

  private void getDistances(final char type, final List<Pair<Integer, Integer>> stack, final Map<Pair<Integer, Integer>, Pair<Integer, Pair<Integer, Integer>>> results,
                            final char[][] currentMap) {
    final List<Pair<Integer, Integer>> newStack = new ArrayList<>();
    for (Pair<Integer, Integer> pos : stack) {
      switch (currentMap[pos.component2()][pos.component1()]) {

        case 'G':
        case 'E':
          if (currentMap[pos.component2()][pos.component1()] == type) {
            results.put(pos, new Pair(0,null));
            break;
          }
        case '#':
          results.put(pos, new Pair(Integer.MAX_VALUE, null));
          //stack.remove(pos);
          break;
        default:
            results.put(pos, new Pair(Integer.MAX_VALUE, null));
          final List<Pair<Integer, Integer>> candidates = new ArrayList<>();
          candidates.add(new Pair(pos.component1(), pos.component2() - 1));
          candidates.add(new Pair(pos.component1() - 1, pos.component2()));
          candidates.add(new Pair(pos.component1() + 1, pos.component2()));
          candidates.add(new Pair(pos.component1(), pos.component2() + 1));
          for(Pair<Integer, Integer> candidate : candidates){
            if(!stack.contains(candidate) && !newStack.contains(candidate)
                && ((int) results.getOrDefault(candidate, new Pair(0, null)).getFirst() != Integer.MAX_VALUE)) {
              newStack.add(candidate);
            }
          }
      }
    }

    if(newStack.size()>0){
      getDistances(type, newStack, results, currentMap);
    }


    for (Pair<Integer, Integer> pos : stack) {
      switch (currentMap[pos.component2()][pos.component1()]) {
        case 'G':
        case 'E':
        case '#':
          break;
        default:

          final List<Pair<Integer, Integer>> candidates = new ArrayList<>();
          candidates.add(new Pair(pos.component1(), pos.component2() - 1));
          candidates.add(new Pair(pos.component1() - 1, pos.component2()));
          candidates.add(new Pair(pos.component1() + 1, pos.component2()));
          candidates.add(new Pair(pos.component1(), pos.component2() + 1));

          int best = Integer.MAX_VALUE;
          Pair<Integer, Integer> bestCoords = null;
          for(Pair<Integer, Integer> candidate : candidates){
            if(results.getOrDefault(candidate, new Pair<Integer, Pair<Integer, Integer>>(Integer.MAX_VALUE, null)).component1() < best-1){
              best = results.get(candidate).component1()+1;
              bestCoords = results.get(candidate).component2();
            }
          }
          if(best==1) {
            results.put(pos, new Pair(best, pos));
          } else{
            results.put(pos, new Pair(best, bestCoords));
          }

      }
    }
  }

  private char[][] updateMap(final char[][] map, final List<Unit> units) {
    final char[][] result = new char[map.length][];

    for (int i = 0; i < map.length; i++) {
      result[i] = map[i].clone();
    }

    for (Unit unit : units) {
      result[unit.pos.component2()][unit.pos.component1()] = unit.type;
    }

    return result;
  }

  public static void main(String[] args) {
    final long now = System.currentTimeMillis();
    for(int i=3;i<=200;i++){
      if(new day15b().solveShit(inputMarines,i)){
        System.out.println("YESYESYES" + i);
        return;
      }
    }

    System.out.println(System.currentTimeMillis() - now);
  }

  private class Unit {
    public char type;
    public int ap = 3;
    public int hp = 200;
    public boolean ticked = false;
    Pair<Integer, Integer> pos;

    public Unit(char type, Pair pos, int ap) {
      this.type = type;
      this.pos = pos;
      this.ap=ap;
    }

    public boolean isNearBy(Unit other) {
      return Math.abs(other.pos.component1() - this.pos.component1()) + Math.abs(other.pos.component2() - this.pos.component2()) == 1;
    }
  }
}
