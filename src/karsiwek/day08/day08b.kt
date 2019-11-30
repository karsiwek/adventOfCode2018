package karsiwek.day08

fun getMetas2(input: String): Any {
    var data = input
            .split("\n")
            .filter { line -> !line.trim().equals("") }
            .get(0)
            .split(" ")
            .map { it.toInt() }

    return getMetasForNode2(data)
}

fun getMetasForNode2(input: List<Int>): Pair<Int, Int> { //length, metasum
    if (input.size == 0) {
        return Pair(0, 0);
    }
    var nodesCount = input[0];
    var metaCount = input[1]
    var metaSum = 0;

    if (nodesCount == 0) {
        return Pair(metaCount + 2,
                input.subList(2, 2 + metaCount).sum());
    } else {
        var actNodeIndex = 2;
        var nodeRefs: Map<Int, Int> = mapOf();
        for (i in (1..nodesCount)) {
            var nodeRes = getMetasForNode2(input.subList(actNodeIndex, input.size - metaCount))
            nodeRefs = nodeRefs.plus(Pair(i, nodeRes.second));

            actNodeIndex += nodeRes.first;
        }
        metaSum += input.subList(actNodeIndex, actNodeIndex + metaCount).map { nodeRefs.getOrDefault(it, 0) }.sum();
        return Pair(actNodeIndex + metaCount, metaSum)
    }

}

fun main(args: Array<String>) {

    System.out.println(getMetas2(input2));
}