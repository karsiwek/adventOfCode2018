package karsiwek.day19


var operations = listOf("addi", "addr", "muli", "mulr", "bani", "banr", "borr", "bori", "seti", "setr", "gtri", "gtrr", "eqri", "eqrr", "gtir", "eqir")

var input1 = """#ip 0
seti 5 0 1
seti 6 0 2
addi 0 1 0
addr 1 2 3
setr 1 0 0
seti 8 0 4
seti 9 0 5""".trimIndent();

var input =
        """#ip 4
addi 4 16 4
seti 1 7 1
seti 1 8 2
mulr 1 2 3
eqrr 3 5 3
addr 3 4 4
addi 4 1 4
addr 1 0 0
addi 2 1 2
gtrr 2 5 3
addr 4 3 4
seti 2 1 4
addi 1 1 1
gtrr 1 5 3
addr 3 4 4
seti 1 8 4
mulr 4 4 4
addi 5 2 5
mulr 5 5 5
mulr 4 5 5
muli 5 11 5
addi 3 4 3
mulr 3 4 3
addi 3 21 3
addr 5 3 5
addr 4 0 4
seti 0 5 4
setr 4 1 3
mulr 3 4 3
addr 4 3 3
mulr 4 3 3
muli 3 14 3
mulr 3 4 3
addr 5 3 5
seti 0 2 0
seti 0 0 4""".trimIndent();


fun calculateLine(command: String, parametes: List<Int>, registers: List<Int>): List<Int> {
    when (command.subSequence(0, 3)) {
        "add" -> return doMathOperation(command.substring(3, 4), parametes, registers, { a: Int, b: Int -> a + b })
        "mul" -> return doMathOperation(command.substring(3, 4), parametes, registers, { a: Int, b: Int -> a * b })
        "ban" -> return doMathOperation(command.substring(3, 4), parametes, registers, { a: Int, b: Int -> a.and(b) })
        "bor" -> return doMathOperation(command.substring(3, 4), parametes, registers, { a: Int, b: Int -> a.or(b) })
        "set" -> return doMathOperationOnSet(command.substring(3, 4), parametes, registers, { a: Int, b: Int -> a })
        "gtr" -> return doMathOperation(command.substring(3, 4), parametes, registers, { a: Int, b: Int -> if (a > b) 1 else 0 })
        "eqr" -> return doMathOperation(command.substring(3, 4), parametes, registers, { a: Int, b: Int -> if (a == b) 1 else 0 })
        "gti" -> return doMathOperationOnI(command.substring(3, 4), parametes, registers, { a: Int, b: Int -> if (a > b) 1 else 0 })
        "eqi" -> return doMathOperationOnI(command.substring(3, 4), parametes, registers, { a: Int, b: Int -> if (a == b) 1 else 0 });
    }
    return registers;
}

fun doMathOperationOnSet(type: String, parametes: List<Int>, registers: List<Int>, function: (Int, Int) -> Int): List<Int> {
    var result = registers.toIntArray();
    if (type == "i") {
        result[parametes[2]] = function.invoke(parametes[0], parametes[1]);
    } else {
        result[parametes[2]] = function.invoke(registers[parametes[0]], parametes[1]);
    }
    return result.toList()
}

fun doMathOperationOnI(type: String, parametes: List<Int>, registers: List<Int>, function: (Int, Int) -> Int): List<Int> {
    var result = registers.toIntArray();
    result[parametes[2]] = function.invoke(parametes[0], registers[parametes[1]]);
    return result.toList()
}

fun doMathOperation(type: String, parametes: List<Int>, registers: List<Int>, function: (Int, Int) -> Int): List<Int> {
    var result = registers.toIntArray();
    if (type == "i") {
        result[parametes[2]] = function.invoke(registers[parametes[0]], parametes[1]);
    } else {
        result[parametes[2]] = function.invoke(registers[parametes[0]], registers[parametes[1]])
    }
    return result.toList()
}


fun main(args: Array<String>) {


    var lines = input.split("\n").map { it.trim() }.filter { it != "" };

    var ip = lines.get(0).split(" ").get(1).toInt();
    var code = lines.subList(1, lines.size).map { it.split(" ") }

    var loops = 0;
    //var registers = listOf<Int>(1, 0, 0, 0, 0, 0);
    //var registers = listOf<Int>(1, 2, 10551345, 0, 9, 10551345);
   // var registers = listOf<Int>(4, 10551346, 10551346, 1, 13, 10551345);


    //var registers = listOf<Int>(1, 0, 0, 0, 0, 0);
    //var registers = listOf<Int>(0, 1, 10551345, 0, 10, 10551345);
    //var registers = listOf<Int>(1, 2, 10551345, 0, 9, 10551345)
    //var registers = listOf<Int>(1, 3, 3517115, 0, 3, 10551345)

    //var registers = listOf<Int>(4, 3, 10551345, 1, 9, 10551345)
    var registers = listOf<Int>(19354944, 10551346, 10551346, 1, 13, 10551345)


    while (true) {
        loops++;
        var lineNo = registers.get(ip);
        if (lineNo >= code.size) {
            System.out.println(registers);
            return
        }
        var lineOfCode = code.get(lineNo);


            System.out.print(lineNo)
            System.out.print("\\t");
            System.out.print(lineOfCode)
            System.out.print("\\t");
            System.out.print(registers)
            System.out.println()


       // System.out.println(lineOfCode);
        registers = calculateLine(lineOfCode[0], lineOfCode.subList(1, 4).map { it.toInt() }, registers);

        registers = registers.subList(0, ip).plus(registers.get(ip) + 1).plus(registers.subList(ip + 1, registers.size));
    }

}


//b

//10551345 to low