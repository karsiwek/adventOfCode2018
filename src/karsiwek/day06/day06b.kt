package karsiwek.day06

fun getArea2(input: String): Any {
    var points = input
            .split("\n")
            .filter { line -> !line.trim().equals("") }
            .map { Pair(it.split(",")[0].trim().toInt(), it.split(",")[1].trim().toInt()) }
    var boundaries = getBoundaryPoints(points);
    System.out.println(boundaries)
    // return boundaries;
    return calculateDistances(points, mapOf(), points.toList()).entries.filter { it.value < 10000 }.count()
}

tailrec fun calculateDistances(points: List<Pair<Int, Int>>, result: Map<Pair<Int, Int>, Int>, stack: List<Pair<Int, Int>>): Map<Pair<Int, Int>, Int> {

    if (stack.isEmpty()) return result;
    var head = stack.get(0);

    System.out.println(stack.size.toString() + "<>" + result.size + "<>x:" + head.first + " y:" + head.second);

    var newElemsStack = listOf(
            Pair(head.first, head.second - 1),
            Pair(head.first, head.second + 1),
            Pair(head.first - 1, head.second),
            Pair(head.first + 1, head.second)
    ).filter { !stack.contains(it) && !result.keys.contains(it) };

    var distances = points.map { Pair(it, getMDist(head, it)) }
    var sum = distances.sumBy { it.second };

    if (sum < (10000)) {
        return calculateDistances(points, result.plus(Pair(head, sum)), stack.plus(newElemsStack).minus(head));
    } else {
        return calculateDistances(points, result.plus(Pair(head, sum)), stack.minus(head));
    }

}

fun main(args: Array<String>) {

    System.out.println(getArea2(input2));
}

