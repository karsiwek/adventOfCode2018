package karsiwek.day04

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


fun getMostPredictableOne(input: String): Any {
    var schedule = input
            .split("\n")
            .filter { line -> !line.trim().equals("") }
            .map { """\[([^\]]+)\]\ (.*)""".toRegex().find(it)!!.destructured }
            .map { (time, command) -> Pair<LocalDateTime, String>(LocalDateTime.parse(time, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")), command) }
            .sortedBy { it.first }
    var currentGuard = "";
    var lastFallAsleep: LocalDateTime? = null;
    var guardsSleeping = mapOf<String, List<Int>>()
    for (elem in schedule) {
        if ("""(#[\d]+)""".toRegex().containsMatchIn(elem.second)) {
            currentGuard = """(#[\d]+)""".toRegex().find(elem.second)!!.destructured.component1();
            lastFallAsleep = null;
        } else if (elem.second.equals("falls asleep")) {
            lastFallAsleep = elem.first;
        } else if (elem.second.equals("wakes up")) {
            guardsSleeping = guardsSleeping.plus(Pair(currentGuard, guardsSleeping.getOrDefault(currentGuard, listOf()).plus(getMinutesBetween(lastFallAsleep, elem.first))))
        }
    }
    return guardsSleeping.entries.flatMap { it.value.map { minute -> Pair(it.key, minute) } }.groupBy { it }
            .map { Pair(it.key, it.value.size) }
            .sortedBy { -it.second }.get(0);
}


fun main(args: Array<String>) {
    System.out.print(getMostPredictableOne(input2));
}