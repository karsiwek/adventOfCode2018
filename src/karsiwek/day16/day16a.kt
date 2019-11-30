package karsiwek.day16


var operations = listOf("addi", "addr", "muli", "mulr", "bani", "banr", "borr", "bori", "seti", "setr", "gtri", "gtrr", "eqri", "eqrr", "gtir", "eqir")

var input2 = """
    Before: [3, 2, 1, 1]
9 2 1 2
After:  [3, 2, 2, 1]""";

var input3 =
        """
Before: [1, 0, 3, 0]
5 3 2 2
After:  [1, 0, 1, 0]
""".trimIndent();


fun calculateLine(command: String, parametes: List<Int>, registers: List<Int>): List<Int> {
    when(command.subSequence(0,3)) {
        "add" -> return doMathOperation(command.substring(3,4), parametes, registers, { a:Int, b:Int -> a+b})
        "mul" -> return doMathOperation(command.substring(3,4), parametes, registers, { a:Int, b:Int -> a*b})
        "ban" -> return doMathOperation(command.substring(3,4), parametes, registers, { a:Int, b:Int -> a.and(b)})
        "bor" -> return doMathOperation(command.substring(3,4), parametes, registers, { a:Int, b:Int -> a.or(b)})
        "set" -> return doMathOperationOnSet(command.substring(3,4), parametes, registers, { a:Int, b:Int -> a})
        "gtr" -> return doMathOperation(command.substring(3,4), parametes, registers, { a:Int, b:Int -> if (a>b)1 else 0})
        "eqr" -> return doMathOperation(command.substring(3,4), parametes, registers, { a:Int, b:Int -> if (a==b)1 else 0})
        "gti" -> return doMathOperationOnI(command.substring(3,4),parametes, registers, { a:Int, b:Int -> if (a>b)1 else 0})
        "eqi" -> return doMathOperationOnI(command.substring(3,4),parametes, registers, { a:Int, b:Int -> if (a==b)1 else 0});
    }
    return registers;
}

fun doMathOperationOnSet(type: String,parametes: List<Int>, registers: List<Int>, function: (Int, Int) -> Int): List<Int> {
    var result = registers.toIntArray();
    if(type=="i"){
        result[parametes[2]] = function.invoke(parametes[0], registers[parametes[1]]);
    } else {
        result[parametes[2]] = function.invoke(registers[parametes[0]], registers[parametes[1]]);
    }
    return result.toList()
}

fun doMathOperationOnI(type: String,parametes: List<Int>, registers: List<Int>, function: (Int, Int) -> Int): List<Int> {
    var result = registers.toIntArray();
    result[parametes[2]] = function.invoke(parametes[0], registers[parametes[1]]);
    return result.toList()
}

fun doMathOperation(type: String, parametes: List<Int>, registers: List<Int>, function: (Int, Int) -> Int): List<Int> {
    var result = registers.toIntArray();
    if(type=="i"){
       result[parametes[2]] = function.invoke(registers[parametes[0]], parametes[1]);
    } else {
        result[parametes[2]] = function.invoke(registers[parametes[0]], registers[parametes[1]])
    }
    return result.toList()
}

fun getAllPosssibleOperationsFor(parameters: List<Int>, input: List<Int>, output: List<Int>): List<String> {
    return operations.filter { calculateLine(it, parameters, input) == output};
}


fun main(args: Array<String>) {

  //  operations.forEach{System.out.println(it + calculateLine(it, listOf(1,2,3), listOf(11,12,13,14)))};
 //   System.out.println(calculateLine("gtri", listOf(1, 1, 3), listOf(1,2,3,4)))
    System.out.println(calculateLine("eqir", listOf(1, 1, 3), listOf(1,2,3,4)))
    System.out.println(calculateLine("eqir", listOf(1, 0, 3), listOf(1,2,3,4)))
    System.out.println(calculateLine("eqir", listOf(2, 1, 3), listOf(1,2,3,4)))

    //return;

    var lines = input.split("\n").map { it.trim() }.filter { it != "" };

    var data = listOf<Triple<List<Int>, List<Int>, List<Int>>>()
    var before:List<Int> = listOf()
    var after:List<Int> = listOf()
    var command : List<Int> = listOf()
    for(line in lines){
        if(line.contains("Before:")){
            before = line.split(":")[1].trim().trim('[', ']').trim().split(",").map { it.trim().toInt() }
        } else if(line.contains("After:")){
            after = line.split(":")[1].trim().trim('[', ']').trim().split(",").map { it.trim().toInt() }
            data = data.plus(Triple(command, before, after));
        } else {
            command = line.split(" ").map { it.toInt() }
        }

    }

    var result = data.map { Pair(it.first[0], getAllPosssibleOperationsFor(it.first.subList(1, 4), it.second, it.third)) };
    System.out.println(result);
    System.out.println(result.filter { it.second.size>=3 }.count());


//     var dict:Map<Int, String> = mapOf();
    val entries = result
            .groupBy { it.first }
            .entries
    var allPossibilities = entries
            .map { it.toPair() }
            .map { Pair(it.first,
                    it.second
                            .map { it.second }
                            .reduce {
                                a, b -> a.intersect(b).toList() }) }
            .toMap();
//    while (dict.size<16){
//        var allSingle = allPossibilities.entries.filter { it.value.size == 1 }
//
//        allSingle.forEach{single -> run { dict = dict.plus(Pair(single.key, single.value.get(0)!!)) }}
//
//        allPossibilities = allPossibilities.map { Pair(it.key, it.value.filter { com -> !dict.containsValue(com) }) }.toMap();
//
//        System.out.println(dict.size);
//    }

    var results = getDict(listOf<String>(), allPossibilities).toSet();
System.out.println("asdasdA");
    System.out.println(results);
    var code = part2.split("\n").map { it.trim().split(" ").map { it.trim().toInt() } }
    var register0 = setOf<Int>()
    for(result in results) {
        var registers = listOf<Int>(0, 0, 0, 0);
        for(lineOfCode in code){
            registers = calculateLine(result.get(lineOfCode[0]), lineOfCode.subList(1,4), registers);
        }
        register0 = register0.plus(registers.get(0));
        System.out.println(registers);

    }

    System.out.println(register0.toSet().toList().sorted());
}

fun getDict(result: List<String>, allPossibilities: Map<Int, List<String>>): List<List<String>> {
    if(result.size==16) {
        return listOf(result);
    }
    var candidates = listOf<List<String>>()
    var all = HashSet<List<String>>();
    for(chance in allPossibilities[result.size]!!){
        if(!result.contains(chance)){
            candidates = getDict(result.plus(chance), allPossibilities)
            for(candidate in candidates) {
                if(candidate.size==16){
                    all.add(candidate);
                }
            }

        }
    }

    return all.toList();

}


//590 to low
//636!
//637 to hight


//b
//604 to low
// 622 to low
//643 to low
//674