package karsiwek.day03

import java.lang.Integer.min


fun getFreeClaim(input: String): Any {
    val result = input
            .split("\n")
            .filter { line -> !line.trim().equals("") }
            .map { """#(\d+) @ (\d+),(\d+): (\d+)x(\d+)""".toRegex().find(it)!!.destructured }
            .map { (id, startX, startY, sizeX, sizeY) -> claimList(id, startX.toInt(), startY.toInt(), sizeX.toInt(), sizeY.toInt()) }
            .flatMap { lists -> lists }
            .groupBy { pair -> pair.first }
            .entries
            .map { entry -> entry.value.map { entryVals -> Pair(entryVals.second, min(entry.value.size, 2)) } }
            .flatMap { it }
            .groupBy { it.first }
            .map { Pair(it.key, it.value.map { elem -> elem.second }.toSet()) }
            .filter { it.second == setOf(1) }
    return result;
}

fun claimList(id: String, startX: Int, startY: Int, sizeX: Int, sizeY: Int): List<Pair<Pair<Int, Int>, String>> {
    var result = listOf<Pair<Pair<Int, Int>, String>>()
    for (i in (startX..(startX + sizeX - 1))) {
        for (j in (startY..(startY + sizeY - 1))) {
            result = result.plus(Pair(Pair(i, j), id));
        }
    }
    return result;
}


fun main(args: Array<String>) {
    System.out.print(getFreeClaim(input));
}