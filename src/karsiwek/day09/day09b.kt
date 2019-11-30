package karsiwek.day09

val input3: String = """486 players; last marble is worth 7083300 points"""

class MyCircularList {
    private var current: Node;

    constructor(initial: Long) {
        current = Node(null, null, initial);
        current.prev = current;
        current.next = current;
    }

    fun insertRight(value: Long) {
        var newOne = Node(current, current.next, value);
        current.next!!.prev = newOne;
        current.next = newOne;
        current = newOne;
    }

    fun shiftRight(times: Long) {
        for (i in (1..times)) {
            current = current.next!!;
        }
    }

    fun shiftLeft(times: Long) {
        for (i in (1..times)) {
            current = current.prev!!;
        }
    }

    fun pop(): Long {
        var poppedVal = current.value;
        current.next!!.prev = current.prev;
        current.prev!!.next = current.next;
        current = current.next!!;
        return poppedVal;
    }

    data class Node(var prev: Node?, var next: Node?, var value: Long);
}

fun getWinningScore2(input: String): Any {
    var data = input
            .split("\n")
            .map { "([0-9]+) players; last marble is worth ([0-9]+) points".toRegex().find(it.trim())!!.destructured }
            .map { matches -> Pair(matches.component1().toInt(), matches.component2().toInt()) }.get(0)

    var marbles = MyCircularList(0)
    var elvesScores = (0..data.first - 1).map { Pair(it, 0.toLong()) }.toMap()
    var currentElve = 0;
    var currentMarble = 0;
    while (currentMarble <= data.second) {
        if (currentMarble % 10000 == 0) {
            System.out.println(currentMarble)
        }
        currentMarble++;

        if (currentMarble % 23 == 0) {
            marbles.shiftLeft(7)
            var marbleToRemove = marbles.pop();


            elvesScores = elvesScores.plus(Pair(currentElve, elvesScores.getOrDefault(currentElve, 0) + currentMarble + marbleToRemove))
        } else {
            marbles.shiftRight(1)
            marbles.insertRight(currentMarble.toLong());
        }

        currentElve = (currentElve + 1) % elvesScores.size;
    }

    return elvesScores.entries.maxBy { it.value }.toString();
}

fun main(args: Array<String>) {

    System.out.println(getWinningScore2(input3));
}