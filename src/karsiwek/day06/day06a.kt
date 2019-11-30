package karsiwek.day06

import kotlin.math.abs


val input: String = """
1, 1
1, 6
8, 3
3, 4
5, 5
8, 9
""".trimIndent()

val input2: String = """
242, 112
292, 356
66, 265
73, 357
357, 67
44, 303
262, 72
220, 349
331, 301
338, 348
189, 287
285, 288
324, 143
169, 282
114, 166
111, 150
251, 107
176, 196
254, 287
146, 177
149, 213
342, 275
158, 279
327, 325
201, 70
145, 344
227, 345
168, 261
108, 236
306, 222
174, 289
67, 317
316, 302
248, 194
67, 162
232, 357
300, 193
229, 125
326, 234
252, 343
51, 263
348, 234
136, 337
146, 82
334, 62
255, 152
326, 272
114, 168
292, 311
202, 62
"""

fun getArea(input: String): Any {
    var points = input
            .split("\n")
            .filter { line -> !line.trim().equals("") }
            .map { Pair(it.split(",")[0].trim().toInt(), it.split(",")[1].trim().toInt()) }
    var boundaries = getBoundaryPoints(points);
    System.out.println(boundaries)
    // return boundaries;
    return calculateAreas(boundaries, points, mapOf(), points.toList()).entries.groupBy { it.value }.entries.map { Pair(it.key, it.value.size) }.sortedBy { -it.second }.get(0)
}

tailrec fun calculateAreas(boundaries: Set<Pair<Int, Int>>, points: List<Pair<Int, Int>>, result: Map<Pair<Int, Int>, Pair<Int, Int>>, stack: List<Pair<Int, Int>>): Map<Pair<Int, Int>, Pair<Int, Int>> {

    if (stack.isEmpty()) return result;
    var head = stack.get(0);

    System.out.println(stack.size.toString() + "<>" + result.size + "<>x:" + head.first + " y:" + head.second);

    var newElemsStack = listOf(
            Pair(head.first, head.second - 1),
            Pair(head.first, head.second + 1),
            Pair(head.first - 1, head.second),
            Pair(head.first + 1, head.second)
    ).filter { !stack.contains(it) && !result.keys.contains(it) };

    var closest = points.map { Pair(it, getMDist(head, it)) }.groupBy { it.second }.entries.sortedBy { entry -> entry.key }.get(0);
    if (closest.value.size == 1 && !boundaries.contains(closest.value.get(0).first)) {
        return calculateAreas(boundaries, points, result.plus(Pair(head, closest.value.get(0).first)), stack.minus(head).plus(newElemsStack));
    } else {
        return calculateAreas(boundaries, points, result.plus(Pair(head, head)), stack.minus(head));
    }
}


fun getBoundaryPoints(points: List<Pair<Int, Int>>): Set<Pair<Int, Int>> {
    var kartesian = points.flatMap { point -> points.map { Pair(point, it) } }


    var result = listOf<Pair<Int, Int>>();
    //from bot
    result = result.plus(
            points.minus(kartesian.filter { it.second.second > it.first.second && abs(it.second.second - it.first.second) >= abs(it.second.first - it.first.first) }.map { it.second }.toSet())
    )
//    //from top
    result = result.plus(
            points.minus(kartesian.filter { it.second.second < it.first.second && abs(it.second.second - it.first.second) >= abs(it.second.first - it.first.first) }.map { it.second }.toSet())
    )

//from left
    result = result.plus(
            points.minus(kartesian.filter { it.second.first > it.first.first && abs(it.second.second - it.first.second) <= abs(it.second.first - it.first.first) }.map { it.second }.toSet())
    )

//from right
    result = result.plus(
            points.minus(kartesian.filter { it.second.first < it.first.first && abs(it.second.second - it.first.second) <= abs(it.second.first - it.first.first) }.map { it.second }.toSet())
    )

    return result.toSet();
}

fun getAngle(a: Pair<Int, Int>, b: Pair<Int, Int>): Double {
    var ang = (Math.acos((b.first.toDouble() - a.first.toDouble())
            / getDist(a, b)) + Math.PI * 2) % (Math.PI * 2);
    if (b.second.toDouble() - a.second.toDouble() < 0) {
        return ((Math.PI * 2) - ang);
    } else {
        return ang;
    }
}

fun getDist(a: Pair<Int, Int>, b: Pair<Int, Int>): Double {
    return Math.sqrt(
            Math.pow(b.first.toDouble() - a.first.toDouble(), 2.toDouble())
                    + Math.pow(b.second.toDouble() - a.second.toDouble(), 2.toDouble()))
}

fun getMDist(a: Pair<Int, Int>, b: Pair<Int, Int>): Int {
    return abs(a.first - b.first) + abs(a.second - b.second);
}

fun main(args: Array<String>) {

    System.out.println(Math.toDegrees(getAngle(Pair(1, 1), Pair(2, 2))));
    System.out.println(Math.toDegrees(getAngle(Pair(1, 1), Pair(1, 0))));
    System.out.println(Math.toDegrees(getAngle(Pair(1, 1), Pair(2, 1))));
    System.out.println(Math.toDegrees(getAngle(Pair(1, 1), Pair(0, 1))));
    System.out.println(Math.toDegrees(getAngle(Pair(1, 1), Pair(0, 0))));

    System.out.println(getArea(input2));
}