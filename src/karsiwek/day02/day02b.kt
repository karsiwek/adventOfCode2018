package karsiwek.day02

fun myCompare(a: String, b: String): Int {
    var i = 0;
    if (a.length != b.length) return 2;
    var diffs = 0;
    while (i < a.length) {
        if (a[i] !== b[i]) diffs += 1;

        i++;
        if (diffs > 1) return 2;
    }
    return diffs;
}

fun getId(input: String): String {
    val codes = input
            .split("\n")
            .filter { line -> !line.trim().equals("") }
            .map { line -> line.trim() }

    var ids = codes.map { code -> Pair(code, codes.filter { secondCode -> myCompare(code, secondCode) == 1 }) }
            .filter { pair -> pair.second.size > 0 }
            .map { pair -> getCode(pair.first, pair.second.get(0)) }
    return ids.get(0)
}

fun getCode(first: String, second: String): String {
    var i = 0;
    var res = "";

    while (i < first.length) {
        if (first[i] == second[i]) res += first[i]
        i++;
    }
    return res;
}

fun main(args: Array<String>) {
    System.out.print(getId(input));
}