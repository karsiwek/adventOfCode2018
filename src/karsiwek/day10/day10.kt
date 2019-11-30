package karsiwek.day10

import kotlin.math.abs


val input: String = """position=< 9,  1> velocity=< 0,  2>
position=< 7,  0> velocity=<-1,  0>
position=< 3, -2> velocity=<-1,  1>
position=< 6, 10> velocity=<-2, -1>
position=< 2, -4> velocity=< 2,  2>
position=<-6, 10> velocity=< 2, -2>
position=< 1,  8> velocity=< 1, -1>
position=< 1,  7> velocity=< 1,  0>
position=<-3, 11> velocity=< 1, -2>
position=< 7,  6> velocity=<-1, -1>
position=<-2,  3> velocity=< 1,  0>
position=<-4,  3> velocity=< 2,  0>
position=<10, -3> velocity=<-1,  1>
position=< 5, 11> velocity=< 1, -2>
position=< 4,  7> velocity=< 0, -1>
position=< 8, -2> velocity=< 0,  1>
position=<15,  0> velocity=<-2,  0>
position=< 1,  6> velocity=< 1,  0>
position=< 8,  9> velocity=< 0, -1>
position=< 3,  3> velocity=<-1,  1>
position=< 0,  5> velocity=< 0, -1>
position=<-2,  2> velocity=< 2,  0>
position=< 5, -2> velocity=< 1,  2>
position=< 1,  4> velocity=< 2,  1>
position=<-2,  7> velocity=< 2, -2>
position=< 3,  6> velocity=<-1, -1>
position=< 5,  0> velocity=< 1,  0>
position=<-6,  0> velocity=< 2,  0>
position=< 5,  9> velocity=< 1, -2>
position=<14,  7> velocity=<-2,  0>
position=<-3,  6> velocity=< 2, -1>""".trimIndent()

val input2: String = """position=<-32494,  54541> velocity=< 3, -5>
position=<-21598,  11014> velocity=< 2, -1>
position=< 21906,  21894> velocity=<-2, -2>
position=<-32484, -32508> velocity=< 3,  3>
position=<-54245, -21619> velocity=< 5,  2>
position=<-54251,  11012> velocity=< 5, -1>
position=<-54235,  32774> velocity=< 5, -3>
position=<-10726,  32773> velocity=< 1, -3>
position=<-43370,  21892> velocity=< 4, -2>
position=< 54586, -32500> velocity=<-5,  3>
position=<-32492,  21896> velocity=< 3, -2>
position=<-43350,  43661> velocity=< 4, -4>
position=<-54243, -10739> velocity=< 5,  1>
position=<-32494,  43661> velocity=< 3, -4>
position=<-10705,  11021> velocity=< 1, -1>
position=< 43698,  21900> velocity=<-4, -2>
position=< 54582, -54260> velocity=<-5,  5>
position=< 43686,  54533> velocity=<-4, -5>
position=< 11050, -10740> velocity=<-1,  1>
position=<-43318, -32506> velocity=< 4,  3>
position=< 32814,  32775> velocity=<-3, -3>
position=< 32842, -21624> velocity=<-3,  2>
position=< 11045, -10746> velocity=<-1,  1>
position=<-10726,  11020> velocity=< 1, -1>
position=<-43314,  21896> velocity=< 4, -2>
position=<-32442, -21620> velocity=< 3,  2>
position=< 43725,  32776> velocity=<-4, -3>
position=< 11051,  43654> velocity=<-1, -4>
position=< 54586,  21896> velocity=<-5, -2>
position=< 43682,  32773> velocity=<-4, -3>
position=<-21582,  32780> velocity=< 2, -3>
position=< 43690, -43388> velocity=<-4,  4>
position=< 32838, -21623> velocity=<-3,  2>
position=< 43691, -54261> velocity=<-4,  5>
position=<-43371, -43379> velocity=< 4,  4>
position=< 54546, -10740> velocity=<-5,  1>
position=< 21958, -32507> velocity=<-2,  3>
position=<-32454,  21899> velocity=< 3, -2>
position=<-32486,  21893> velocity=< 3, -2>
position=< 11042, -21625> velocity=<-1,  2>
position=<-10721, -10740> velocity=< 1,  1>
position=< 11042,  32781> velocity=<-1, -3>
position=<-21598,  11018> velocity=< 2, -1>
position=<-21578, -43384> velocity=< 2,  4>
position=< 43702, -43383> velocity=<-4,  4>
position=< 11077, -10748> velocity=<-1,  1>
position=<-43365,  11012> velocity=< 4, -1>
position=<-54202, -54268> velocity=< 5,  5>
position=< 32786, -10741> velocity=<-3,  1>
position=< 54582,  11017> velocity=<-5, -1>
position=<-32465, -43380> velocity=< 3,  4>
position=< 21931, -43385> velocity=<-2,  4>
position=< 43682, -54259> velocity=<-4,  5>
position=<-43349, -43386> velocity=< 4,  4>
position=<-43318, -43380> velocity=< 4,  4>
position=< 54582, -21622> velocity=<-5,  2>
position=< 21966, -21628> velocity=<-2,  2>
position=<-21553, -21628> velocity=< 2,  2>
position=<-10717,  11016> velocity=< 1, -1>
position=<-32486, -54265> velocity=< 3,  5>
position=< 11061, -32508> velocity=<-1,  3>
position=< 32844, -54264> velocity=<-3,  5>
position=<-10733, -43384> velocity=< 1,  4>
position=< 54591, -10739> velocity=<-5,  1>
position=< 21934, -54266> velocity=<-2,  5>
position=<-32438,  43657> velocity=< 3, -4>
position=< 21922, -43381> velocity=<-2,  4>
position=<-43374,  21893> velocity=< 4, -2>
position=<-21606, -21625> velocity=< 2,  2>
position=<-54251,  43656> velocity=< 5, -4>
position=< 32815, -10748> velocity=<-3,  1>
position=<-43364, -10739> velocity=< 4,  1>
position=< 21957, -43388> velocity=<-2,  4>
position=< 11082, -43381> velocity=<-1,  4>
position=<-54236,  11018> velocity=< 5, -1>
position=<-21593, -10739> velocity=< 2,  1>
position=<-10694,  32781> velocity=< 1, -3>
position=< 21963, -54268> velocity=<-2,  5>
position=<-32493, -21624> velocity=< 3,  2>
position=<-21558,  11015> velocity=< 2, -1>
position=<-43342,  32780> velocity=< 4, -3>
position=<-54246, -43380> velocity=< 5,  4>
position=<-21586,  21894> velocity=< 2, -2>
position=<-43363, -54259> velocity=< 4,  5>
position=<-43370, -21624> velocity=< 4,  2>
position=<-43317, -43384> velocity=< 4,  4>
position=<-43358,  21900> velocity=< 4, -2>
position=< 54575,  32773> velocity=<-5, -3>
position=<-43334, -54267> velocity=< 4,  5>
position=< 43703, -21628> velocity=<-4,  2>
position=<-32483,  54541> velocity=< 3, -5>
position=<-21580,  32781> velocity=< 2, -3>
position=< 54602,  54538> velocity=<-5, -5>
position=< 43723,  43656> velocity=<-4, -4>
position=< 11034, -21621> velocity=<-1,  2>
position=< 32822, -32502> velocity=<-3,  3>
position=< 54582,  32780> velocity=<-5, -3>
position=<-54238, -21620> velocity=< 5,  2>
position=< 43690,  32781> velocity=<-4, -3>
position=<-32475,  32779> velocity=< 3, -3>
position=<-21578,  32779> velocity=< 2, -3>
position=< 11084,  21892> velocity=<-1, -2>
position=< 43718, -10745> velocity=<-4,  1>
position=<-10698,  43660> velocity=< 1, -4>
position=<-32490,  43652> velocity=< 3, -4>
position=<-10674, -54268> velocity=< 1,  5>
position=< 21946, -43381> velocity=<-2,  4>
position=<-54249,  11021> velocity=< 5, -1>
position=< 11069,  54541> velocity=<-1, -5>
position=< 43669, -54259> velocity=<-4,  5>
position=< 11066,  54532> velocity=<-1, -5>
position=<-43318, -21623> velocity=< 4,  2>
position=< 11066, -21620> velocity=<-1,  2>
position=<-21586, -32501> velocity=< 2,  3>
position=< 21949, -10739> velocity=<-2,  1>
position=<-54253, -10748> velocity=< 5,  1>
position=<-21561, -32508> velocity=< 2,  3>
position=<-54237,  32777> velocity=< 5, -3>
position=< 11070,  54541> velocity=<-1, -5>
position=<-10707,  21897> velocity=< 1, -2>
position=< 54557,  43652> velocity=<-5, -4>
position=< 32821, -54268> velocity=<-3,  5>
position=<-43334,  11014> velocity=< 4, -1>
position=< 54546, -32501> velocity=<-5,  3>
position=< 54573,  43656> velocity=<-5, -4>
position=< 54582, -43388> velocity=<-5,  4>
position=< 21938,  32779> velocity=<-2, -3>
position=<-21579,  54541> velocity=< 2, -5>
position=< 43722,  32773> velocity=<-4, -3>
position=<-54198,  21892> velocity=< 5, -2>
position=<-43334, -32499> velocity=< 4,  3>
position=<-32492, -21628> velocity=< 3,  2>
position=<-32434,  11016> velocity=< 3, -1>
position=< 54548, -32508> velocity=<-5,  3>
position=< 21906,  43656> velocity=<-2, -4>
position=<-54228, -43383> velocity=< 5,  4>
position=< 54604, -54264> velocity=<-5,  5>
position=<-10718, -10747> velocity=< 1,  1>
position=< 43718,  54534> velocity=<-4, -5>
position=<-10690, -43379> velocity=< 1,  4>
position=<-21578,  43652> velocity=< 2, -4>
position=< 11050, -10747> velocity=<-1,  1>
position=<-54228,  11016> velocity=< 5, -1>
position=<-54254, -10742> velocity=< 5,  1>
position=<-43349,  11015> velocity=< 4, -1>
position=<-21574, -54265> velocity=< 2,  5>
position=<-21598,  54535> velocity=< 2, -5>
position=<-32469,  32779> velocity=< 3, -3>
position=<-10678,  11016> velocity=< 1, -1>
position=< 21940, -10739> velocity=<-2,  1>
position=< 21916, -21619> velocity=<-2,  2>
position=<-21587,  54536> velocity=< 2, -5>
position=<-32465, -54259> velocity=< 3,  5>
position=< 54567,  54541> velocity=<-5, -5>
position=< 54556,  54541> velocity=<-5, -5>
position=<-32438, -54265> velocity=< 3,  5>
position=< 54565,  32774> velocity=<-5, -3>
position=< 54598, -32506> velocity=<-5,  3>
position=< 11062, -32501> velocity=<-1,  3>
position=<-32485, -32499> velocity=< 3,  3>
position=< 32846,  32776> velocity=<-3, -3>
position=< 11042, -21623> velocity=<-1,  2>
position=< 54571, -32501> velocity=<-5,  3>
position=< 32786,  54533> velocity=<-3, -5>
position=<-10701,  21901> velocity=< 1, -2>
position=<-10707, -10743> velocity=< 1,  1>
position=<-32438, -32507> velocity=< 3,  3>
position=< 32838, -43381> velocity=<-3,  4>
position=<-43318, -43380> velocity=< 4,  4>
position=< 11066,  21895> velocity=<-1, -2>
position=< 21906, -43388> velocity=<-2,  4>
position=<-21557,  11012> velocity=< 2, -1>
position=<-54217, -43388> velocity=< 5,  4>
position=< 54546, -10744> velocity=<-5,  1>
position=<-54198,  21898> velocity=< 5, -2>
position=<-32436, -32508> velocity=< 3,  3>
position=<-32450,  43661> velocity=< 3, -4>
position=<-54222,  21899> velocity=< 5, -2>
position=<-32482,  11021> velocity=< 3, -1>
position=<-43334,  32773> velocity=< 4, -3>
position=< 11038, -32508> velocity=<-1,  3>
position=< 32803, -54264> velocity=<-3,  5>
position=<-32476,  11018> velocity=< 3, -1>
position=<-10726,  11016> velocity=< 1, -1>
position=<-32443, -32508> velocity=< 3,  3>
position=<-21601,  32773> velocity=< 2, -3>
position=< 21925,  54539> velocity=<-2, -5>
position=<-32454,  54537> velocity=< 3, -5>
position=< 32786, -10747> velocity=<-3,  1>
position=<-54245, -21628> velocity=< 5,  2>
position=<-21598,  32780> velocity=< 2, -3>
position=< 54554, -10741> velocity=<-5,  1>
position=<-43322, -10743> velocity=< 4,  1>
position=<-43338, -32506> velocity=< 4,  3>
position=<-43370, -21628> velocity=< 4,  2>
position=< 43690,  21892> velocity=<-4, -2>
position=< 32823,  43652> velocity=<-3, -4>
position=< 54559,  11020> velocity=<-5, -1>
position=<-10705, -43387> velocity=< 1,  4>
position=< 54554,  43658> velocity=<-5, -4>
position=<-54254, -54265> velocity=< 5,  5>
position=<-21578,  43658> velocity=< 2, -4>
position=<-54228, -43383> velocity=< 5,  4>
position=<-10682, -43388> velocity=< 1,  4>
position=<-32446, -10741> velocity=< 3,  1>
position=<-43358,  32781> velocity=< 4, -3>
position=< 21958,  21900> velocity=<-2, -2>
position=< 54574,  54538> velocity=<-5, -5>
position=< 11079, -32508> velocity=<-1,  3>
position=< 43682, -54264> velocity=<-4,  5>
position=< 43687,  32772> velocity=<-4, -3>
position=< 43702,  21893> velocity=<-4, -2>
position=< 32807, -32499> velocity=<-3,  3>
position=<-32467, -21623> velocity=< 3,  2>
position=< 11066, -21625> velocity=<-1,  2>
position=< 11078,  54536> velocity=<-1, -5>
position=< 54575,  21901> velocity=<-5, -2>
position=<-32446, -21620> velocity=< 3,  2>
position=< 21942, -10744> velocity=<-2,  1>
position=<-54204,  43661> velocity=< 5, -4>
position=<-10726, -43384> velocity=< 1,  4>
position=< 54598,  21898> velocity=<-5, -2>
position=<-21590,  21892> velocity=< 2, -2>
position=<-43322,  21899> velocity=< 4, -2>
position=<-21587, -43384> velocity=< 2,  4>
position=< 21957,  21901> velocity=<-2, -2>
position=< 54571, -54262> velocity=<-5,  5>
position=<-43334, -32499> velocity=< 4,  3>
position=< 54551, -43379> velocity=<-5,  4>
position=<-54230, -43379> velocity=< 5,  4>
position=<-32465,  54532> velocity=< 3, -5>
position=<-10726,  32774> velocity=< 1, -3>
position=<-32486,  11013> velocity=< 3, -1>
position=< 54582,  11019> velocity=<-5, -1>
position=<-21614,  32777> velocity=< 2, -3>
position=< 43691, -54266> velocity=<-4,  5>
position=<-43350, -32500> velocity=< 4,  3>
position=< 43722, -10742> velocity=<-4,  1>
position=<-10675, -32504> velocity=< 1,  3>
position=<-43318,  54535> velocity=< 4, -5>
position=<-21574, -21624> velocity=< 2,  2>
position=<-21574, -54261> velocity=< 2,  5>
position=<-21557, -21628> velocity=< 2,  2>
position=< 32798, -21619> velocity=<-3,  2>
position=<-21606,  54537> velocity=< 2, -5>
position=< 11066, -10742> velocity=<-1,  1>
position=< 54598,  43654> velocity=<-5, -4>
position=< 11082,  21896> velocity=<-1, -2>
position=< 21958, -43388> velocity=<-2,  4>
position=< 54581, -21619> velocity=<-5,  2>
position=<-21558,  43652> velocity=< 2, -4>
position=<-21613,  43656> velocity=< 2, -4>
position=<-54241, -54260> velocity=< 5,  5>
position=< 32802, -10742> velocity=<-3,  1>
position=<-54225,  21892> velocity=< 5, -2>
position=<-10706, -10742> velocity=< 1,  1>
position=< 43669, -43384> velocity=<-4,  4>
position=<-21558, -10739> velocity=< 2,  1>
position=< 11042, -32504> velocity=<-1,  3>
position=<-32438, -32500> velocity=< 3,  3>
position=<-10716, -32505> velocity=< 1,  3>
position=<-54250,  11021> velocity=< 5, -1>
position=<-54253, -10739> velocity=< 5,  1>
position=<-10717,  54537> velocity=< 1, -5>
position=< 11042, -43388> velocity=<-1,  4>
position=< 54594,  21899> velocity=<-5, -2>
position=< 32799,  54533> velocity=<-3, -5>
position=<-21598, -32502> velocity=< 2,  3>
position=<-21563, -10739> velocity=< 2,  1>
position=< 21922, -43387> velocity=<-2,  4>
position=< 21962, -43379> velocity=<-2,  4>
position=< 43668,  32781> velocity=<-4, -3>
position=<-54246,  54540> velocity=< 5, -5>
position=< 21908, -21628> velocity=<-2,  2>
position=< 43711, -54259> velocity=<-4,  5>
position=<-54212, -54259> velocity=< 5,  5>
position=<-21574,  32777> velocity=< 2, -3>
position=< 21942, -32507> velocity=<-2,  3>
position=< 43722,  11013> velocity=<-4, -1>
position=< 32845,  54532> velocity=<-3, -5>
position=< 43702,  21897> velocity=<-4, -2>
position=<-32492,  54536> velocity=< 3, -5>
position=<-21574, -10747> velocity=< 2,  1>
position=<-54213, -43379> velocity=< 5,  4>
position=<-54218, -32505> velocity=< 5,  3>
position=<-43316, -21624> velocity=< 4,  2>
position=<-10734, -21625> velocity=< 1,  2>
position=<-21598, -10748> velocity=< 2,  1>
position=<-10693, -43379> velocity=< 1,  4>
position=<-32491, -43384> velocity=< 3,  4>
position=< 21926, -43380> velocity=<-2,  4>
position=<-10691, -54259> velocity=< 1,  5>
position=<-54238,  54539> velocity=< 5, -5>
position=< 11031,  43652> velocity=<-1, -4>
position=<-43334,  11018> velocity=< 4, -1>
position=< 43682, -21625> velocity=<-4,  2>
position=< 21958, -54261> velocity=<-2,  5>
position=< 54595, -32499> velocity=<-5,  3>
position=< 54564,  43658> velocity=<-5, -4>
position=<-32486, -10746> velocity=< 3,  1>"""

fun getPosition(input: String): Any {
    var points = input
            .split("\n")
            .map { "position=<\\ *([\\-0-9]+),\\ *([\\-0-9]+)> velocity=<\\ *([\\-0-9]+),\\ *([\\-0-9]+)>".toRegex().find(it.trim())!!.destructured }
            .map { Pair(Pair(it.component1().toInt(), it.component2().toInt()), Pair(it.component3().toInt(), it.component4().toInt())) }.toList();
    var iterations = 0;
    var minHeight = Int.MAX_VALUE;
    var actHeight = Int.MAX_VALUE;
    var lastPoints = points;
    do {
        lastPoints = points;
        minHeight = actHeight;
        points = lastPoints.map { Pair( Pair(it.first.first + it.second.first, it.first.second + it.second.second), it.second) }

        actHeight = abs(points.maxBy { it.first.second }!!.first.second - points.minBy { it.first.second }!!.first.second)
        iterations++;
    } while(actHeight<minHeight)

    printPoints(lastPoints);
    System.out.println(iterations-1)
return 1;
}

fun printPoints(points: List<Pair<Pair<Int, Int>, Pair<Int, Int>>>) {
    var toPrint = points.map { it.first }.groupBy { it.second }
    var left:Int = points.minBy { it.first.first }!!.first!!.first
    var right:Int  = points.maxBy { it.first.first}!!.first!!.first

    for(i in toPrint.keys.sortedBy { it }){
        var row = toPrint.get(i)!!;
        for(j in (left..right)) {
            if(row.contains(Pair(j, i))){
                System.out.print("#")
            } else {
                System.out.print(".")
            }
        }
        System.out.println()
    }
}

fun main(args: Array<String>) {
    getPosition(input2);
}