package karsiwek.day09


val input: String = """9 players; last marble is worth 25 points""".trimIndent()

val input2: String = """486 players; last marble is worth 70833 points"""

fun getWinningScore(input: String): Any {
    var data = input
            .split("\n")
            .map { "([0-9]+) players; last marble is worth ([0-9]+) points".toRegex().find(it.trim())!!.destructured }
            .map { matches -> Pair(matches.component1().toInt(), matches.component2().toInt()) }.get(0)

    var marbles = listOf(0)
    var currentIndex = 0;
    var elvesScores = (0..data.first - 1).map { Pair(it, 0) }.toMap()
    var currentElve: Int = 0;
    var currentMarble = 0;
    while (currentMarble <= data.second) {
        //System.out.println(marbles);
        if (currentMarble % 1000 == 0) {
            System.out.println(currentMarble)
        }
        currentMarble++;

        if (currentMarble % 23 == 0) {
            var marbleToRemoveIdx = (currentIndex - 7 + 1 + marbles.size) % marbles.size;
            var marbleToRemove = marbles.get(marbleToRemoveIdx);

            marbles = marbles.minus(marbleToRemove);

            currentIndex = (marbleToRemoveIdx - 1) % marbles.size;

            elvesScores = elvesScores.plus(Pair(currentElve, elvesScores.getOrDefault(currentElve, 0) + currentMarble + marbleToRemove))
        } else {
            currentIndex = (currentIndex + 2) % marbles.size;

            marbles = marbles.subList(0, currentIndex + 1).plus(currentMarble).plus(marbles.subList(currentIndex + 1, marbles.size));
        }

        currentElve = (currentElve + 1) % elvesScores.size;
    }

    return elvesScores.entries.maxBy { it.value }.toString();


}

fun main(args: Array<String>) {

    System.out.println(getWinningScore(input2));
}