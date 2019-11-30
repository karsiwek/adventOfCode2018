package karsiwek.day01

fun getFrequencyDuplicate(input: String): Int {
    var changes = input
            .split("\n")
            .filter { line -> !line.trim().equals("") }
            .map { Integer.parseInt(it.trim()) }

    var value = 0;
    var frequencies: Set<Int> = hashSetOf();
    var iter = 0;
    while (true) {
        if (frequencies.contains(value)) {
            return value;
        }
        frequencies = frequencies.plus(value);

        value += changes[iter];
        iter = (iter + 1) % changes.size;
    }
}

fun main(args: Array<String>) {
    System.out.print(getFrequencyDuplicate(input));
}