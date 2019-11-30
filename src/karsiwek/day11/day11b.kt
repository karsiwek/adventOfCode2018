package karsiwek.day11

var TANK_SIZE = 300;
var scores: HashMap<Int, Map<Pair<Int, Int>, Int>> = HashMap();

fun getMaxFuelRackWithUsingCalculatedScores(levels: Map<Pair<Int, Int>, Int>, size: Int): Pair<Pair<Int, Int>, Int> {
    System.out.println(size);
    var maxScores: Map<Pair<Int, Int>, Int>;

    if (scores.containsKey(size-1)) {
        for (subsize in (2..(size - 1)).reversed()) {
            if (size % subsize == 0) {
                var chunks=size/subsize;
                maxScores = (1..(TANK_SIZE - size + 1)).flatMap { x ->
                    (1..(TANK_SIZE - size + 1)).map { y ->
                        Pair(Pair(x, y),
                                (0..(chunks - 1)).flatMap { dx -> (0..(chunks - 1))
                                        .map { dy -> scores.get(subsize)!!.get(Pair(x + subsize * dx, y + subsize * dy)) } }.sumBy { it!! })
                    }
                }.toMap();

                scores.put(size, maxScores);

                return maxScores.entries.maxBy { it.value }!!.toPair();
            }
        }
    }

    maxScores = (1..(TANK_SIZE - size + 1)).flatMap { x ->
        (1..(TANK_SIZE - size + 1)).map { y ->
            Pair(Pair(x, y), 0
                    + (0..(size - 1)).map { levels.get(Pair(x, y + it)) }.sumBy { it!! }
                    + (1..(size - 1)).map { levels.get(Pair(x + it, y)) }.sumBy { it!! }
                    + scores.get(size - 1)!!.get(Pair(x + 1, y + 1))!!
            )
        }
    }.toMap();
    scores.put(size, maxScores);
    return maxScores.entries.maxBy { it.value }!!.toPair();

}

fun main(args: Array<String>) {
    var serial = 9221
    //var serial = 18
    var levels = (1..TANK_SIZE).flatMap { x -> (1..TANK_SIZE).map { y -> Pair(x, y) } }.map { Pair(it, getPowerLevel(serial, it)) }.toMap();
    scores = HashMap();
    scores.put(1, levels);

    var result = (2..TANK_SIZE).map { Pair(it, getMaxFuelRackWithUsingCalculatedScores(levels, it)) }
            .groupBy { it.second.second }
            .entries
            .map { it.toPair() }
            .sortedBy { -it.first }
            .get(0)!!;

    print(result)
}

