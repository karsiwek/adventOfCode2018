package karsiwek.day07


fun getOrderForElves(input: String, elvNumber: Int): Any {
    var points = input
            .split("\n")
            .filter { line -> !line.trim().equals("") }
            .map { "Step ([A-Z]+) must be finished before step ([A-Z]+) can begin.".toRegex().find(it)!!.destructured }
            .map { (before, after) -> Pair(before, after) }

    return proceedWithPoints(points, elvNumber, mapOf<String, Int>(), setOf<String>(), 0)
}

fun proceedWithPoints(points: List<Pair<String, String>>, elvNumber: Int, buildingQueue: Map<String, Int>, donePoints: Set<String>, currTime: Int): Any {
    if (points.flatMap { setOf(it.first, it.second) }.filter { !donePoints.contains(it) }.isEmpty()) {
        return currTime;
    }

    var justFinished = buildingQueue.entries.filter { it.value < currTime }.map { it.key }

    System.out.println(currTime.toString() + "<>" + justFinished);

    var queue = buildingQueue.minus(justFinished);
    var done = donePoints.plus(justFinished);
    var nextItem: String? = null;
    do {
        nextItem = points.flatMap { setOf(it.first, it.second) }
                .filter { !done.contains(it) && !queue.keys.contains(it) }
                .map { pointName -> Pair(pointName, points.filter { point -> point.second == pointName && !done.contains(point.first) }) }
                .filter { it.second.size == 0 }
                .map { it.first }
                .sortedBy { it }.getOrNull(0)
        if (!nextItem.isNullOrBlank() && queue.size < elvNumber) {
            System.out.print(nextItem);
            System.out.println(nextItem!![0].toInt() - 'A'.toInt());
            queue = queue.plus(Pair(nextItem!!, currTime - 1 + (61 + nextItem!![0].toInt() - 'A'.toInt())));
        }
    } while (!nextItem.isNullOrBlank() && buildingQueue.size < elvNumber)

    return proceedWithPoints(points, elvNumber, queue, done, currTime + 1);
}


fun main(args: Array<String>) {

    System.out.println(getOrderForElves(input2, 15));
}
