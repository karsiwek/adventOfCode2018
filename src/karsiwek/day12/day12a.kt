package karsiwek.day12

var input: String = """initial state: #.#.#..##.#....#.#.##..##.##..#..#...##....###..#......###.#..#.....#.###.#...#####.####...#####.#.#

..#.. => .
#...# => .
.#... => #
#.##. => .
..#.# => #
#.#.# => .
###.. => #
###.# => #
..... => .
....# => .
.##.. => #
##### => .
####. => .
..##. => .
##.#. => #
.#..# => #
##..# => .
.##.# => .
.#### => #
..### => .
...## => #
#..## => #
#.... => .
##.## => .
#.#.. => .
##... => .
.#.## => #
.###. => #
...#. => .
#.### => .
#..#. => #
.#.#. => ."""

var input2 = """initial state: #..#.#..##......###...###

...## => #
..#.. => #
.#... => #
.#.#. => #
.#.## => #
.##.. => #
.#### => #
#.#.# => #
#.### => #
##.#. => #
##.## => #
###.. => #
###.# => #
####. => #"""

var ITERATIONS = 50000000000;
fun getState(input: String): Any {
    var initialState = input.split("\n")[0].split(":")[1].trim();
    var firstIdx: Long = 0;
    var changes = input
            .split("\n")
            .map { it.trim() }
            .filter { it != "" && it.indexOf("=") > 0 }
            .map { it.split("=>") }.map { Pair(it[0].trim(), it[1].trim()) }
            .toMap()

    var newGen = ""
    var oldGen = initialState
    var i: Long = 1;
    var states = mapOf<String, Pair<Long, Long>>()

    do {
        if (oldGen.indexOf("#") < 4) {
            oldGen = "...." + oldGen;
            firstIdx -= 4;
        }

        oldGen = oldGen + "....";

        newGen = ".."
        for (j in (2..oldGen.length - 3)) {
            newGen += changes.getOrDefault(oldGen.substring(j - 2, j + 3), ".");
        }

        firstIdx += newGen.indexOf("#");
        oldGen = newGen.trim('.')

        if (states.keys.contains(oldGen)) {
            var spotted = states.get(oldGen)!!;

            if (firstIdx == spotted.first) {
                break;
            }
            var leftIterations = (ITERATIONS - i);
            var cycleSize = i - spotted.second;
            var leftWholeCycles = leftIterations / cycleSize
            var indexesPerCycle = firstIdx - spotted.first;
            firstIdx = firstIdx + indexesPerCycle * leftWholeCycles;

            i = i + leftWholeCycles * cycleSize;
            states = mapOf();
        } else {
            states = states.plus(Pair(oldGen, Pair(firstIdx, i)));
        }


    } while (i++ < ITERATIONS)
    return oldGen.mapIndexed { i, char -> Pair(i + firstIdx, char) }.filter { it.second == '#' }.map { it.first }.sum();
}

fun main(args: Array<String>) {

    System.out.println(getState(input));

}


