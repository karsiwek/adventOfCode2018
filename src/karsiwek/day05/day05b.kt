package karsiwek.day05


fun main(args: Array<String>) {
    var data = input2.split("\n").filter { it.trim() != "" }.get(0).trim();
    var result = data
            .groupBy { it.toLowerCase() }
            .keys.map { key ->
        Pair(key, reducePolymer(data.filter { it.toLowerCase() != key.toLowerCase() }).length)
    }.sortedBy { it.second }.get(0);
    System.out.print(result);

}