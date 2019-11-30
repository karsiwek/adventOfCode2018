package karsiwek.day11


fun getMaxFuelRack(serial: Int, size:Int): Pair<Pair<Int, Int>, Int> {
    System.out.println(size);
    var levels = (1..300).flatMap { x -> (1..300).map { y -> Pair(x, y) } }.map { Pair(it, getPowerLevel(serial, it)) }.toMap();

    var maxScores = (1..(300 - size+1)).flatMap { x ->
        (1..(300 - size+1)).map { y ->
            Pair(Pair(x, y),
                    (0..(size-1)).flatMap { dx -> (0..(size-1)).map { dy -> levels.get(Pair(x + dx, y + dy)) } }.sumBy { it!! })
        }
    }

    return maxScores.maxBy { it.second }!!;
}

fun getPowerLevel(serial: Int, point: Pair<Int, Int>): Int {
    return (((point.first+10)*point.second+serial)*(point.first+10)/100)%10-5;
}

fun main(args: Array<String>) {

    System.out.println(getPowerLevel(8, Pair(3,5)));
    System.out.println(getPowerLevel(57, Pair(122,79)));
    System.out.println(getPowerLevel(39, Pair(217,196)));
    System.out.println(getPowerLevel(71, Pair(101,153)));
    System.out.println(getMaxFuelRack(9221, 3));
}

