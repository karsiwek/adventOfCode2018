package karsiwek.day07


val input: String = """
Step C must be finished before step A can begin.
Step C must be finished before step F can begin.
Step A must be finished before step B can begin.
Step A must be finished before step D can begin.
Step B must be finished before step E can begin.
Step D must be finished before step E can begin.
Step F must be finished before step E can begin.
""".trimIndent()

val input2: String = """
Step B must be finished before step X can begin.
Step H must be finished before step P can begin.
Step Y must be finished before step J can begin.
Step Z must be finished before step I can begin.
Step T must be finished before step U can begin.
Step R must be finished before step C can begin.
Step S must be finished before step J can begin.
Step W must be finished before step J can begin.
Step C must be finished before step L can begin.
Step L must be finished before step F can begin.
Step E must be finished before step G can begin.
Step A must be finished before step G can begin.
Step V must be finished before step X can begin.
Step U must be finished before step O can begin.
Step P must be finished before step F can begin.
Step O must be finished before step I can begin.
Step I must be finished before step F can begin.
Step K must be finished before step F can begin.
Step J must be finished before step F can begin.
Step G must be finished before step X can begin.
Step M must be finished before step X can begin.
Step F must be finished before step Q can begin.
Step Q must be finished before step N can begin.
Step D must be finished before step N can begin.
Step X must be finished before step N can begin.
Step I must be finished before step Q can begin.
Step U must be finished before step I can begin.
Step D must be finished before step X can begin.
Step B must be finished before step W can begin.
Step L must be finished before step N can begin.
Step U must be finished before step X can begin.
Step U must be finished before step J can begin.
Step C must be finished before step V can begin.
Step G must be finished before step N can begin.
Step S must be finished before step K can begin.
Step Q must be finished before step D can begin.
Step J must be finished before step X can begin.
Step V must be finished before step K can begin.
Step Z must be finished before step A can begin.
Step L must be finished before step M can begin.
Step H must be finished before step D can begin.
Step V must be finished before step Q can begin.
Step L must be finished before step V can begin.
Step S must be finished before step D can begin.
Step C must be finished before step Q can begin.
Step S must be finished before step L can begin.
Step E must be finished before step V can begin.
Step E must be finished before step P can begin.
Step C must be finished before step I can begin.
Step O must be finished before step K can begin.
Step H must be finished before step V can begin.
Step M must be finished before step F can begin.
Step K must be finished before step N can begin.
Step C must be finished before step X can begin.
Step G must be finished before step D can begin.
Step E must be finished before step U can begin.
Step R must be finished before step L can begin.
Step K must be finished before step G can begin.
Step W must be finished before step C can begin.
Step B must be finished before step L can begin.
Step L must be finished before step J can begin.
Step U must be finished before step D can begin.
Step I must be finished before step G can begin.
Step Q must be finished before step X can begin.
Step B must be finished before step M can begin.
Step T must be finished before step P can begin.
Step G must be finished before step Q can begin.
Step Y must be finished before step U can begin.
Step M must be finished before step D can begin.
Step P must be finished before step I can begin.
Step I must be finished before step K can begin.
Step O must be finished before step M can begin.
Step H must be finished before step Z can begin.
Step V must be finished before step M can begin.
Step P must be finished before step J can begin.
Step B must be finished before step U can begin.
Step E must be finished before step X can begin.
Step M must be finished before step Q can begin.
Step W must be finished before step L can begin.
Step O must be finished before step J can begin.
Step I must be finished before step X can begin.
Step J must be finished before step N can begin.
Step Y must be finished before step S can begin.
Step E must be finished before step D can begin.
Step M must be finished before step N can begin.
Step E must be finished before step O can begin.
Step I must be finished before step D can begin.
Step V must be finished before step N can begin.
Step R must be finished before step X can begin.
Step Z must be finished before step O can begin.
Step O must be finished before step X can begin.
Step I must be finished before step J can begin.
Step S must be finished before step E can begin.
Step E must be finished before step Q can begin.
Step J must be finished before step Q can begin.
Step H must be finished before step Y can begin.
Step T must be finished before step G can begin.
Step S must be finished before step A can begin.
Step P must be finished before step K can begin.
Step A must be finished before step D can begin.
Step B must be finished before step P can begin.
"""

fun getOrder(input: String): Any {
    var points = input
            .split("\n")
            .filter { line -> !line.trim().equals("") }
            .map { "Step ([A-Z]+) must be finished before step ([A-Z]+) can begin.".toRegex().find(it)!!.destructured }
            .map { (before, after) -> Pair(before, after) }

    return getOrderFun(points, "")
}

tailrec fun getOrderFun(points: List<Pair<String, String>>, order: String): String {
    if (points.flatMap { setOf(it.first, it.second) }.filter { !order.contains(it) }.isEmpty()) {
        return order;
    }

    return getOrderFun(points, order +
            points.flatMap { setOf(it.first, it.second) }
                    .filter { !order.contains(it) }
                    .map { pointName -> Pair(pointName, points.filter { point -> point.second == pointName && !order.contains(point.first) }) }
                    .filter { it.second.size == 0 }
                    .map { it.first }
                    .sortedBy { it }[0])

}

fun main(args: Array<String>) {

    System.out.println(getOrder(input2));
}