package karsiwek.day21


var input =
        """#ip 5
seti 123 0 4
bani 4 456 4
eqri 4 72 4
addr 4 5 5
seti 0 0 5
seti 0 8 4
bori 4 65536 3
seti 14464005 5 4
bani 3 255 2
addr 4 2 4
bani 4 16777215 4
muli 4 65899 4
bani 4 16777215 4
gtir 256 3 2
addr 2 5 5
addi 5 1 5
seti 27 7 5
seti 0 3 2
addi 2 1 1
muli 1 256 1
gtrr 1 3 1
addr 1 5 5
addi 5 1 5
seti 25 2 5
addi 2 1 2
seti 17 9 5
setr 2 2 3
seti 7 3 5
eqrr 4 0 2
addr 2 5 5
seti 5 9 5""".trimIndent();


fun calculateLine(command: String, parametes: List<Long>, registers: List<Long>): List<Long> {
    when (command.subSequence(0, 3)) {
        "add" -> return doMathOperation(command.substring(3, 4), parametes, registers, { a: Long, b: Long -> a + b })
        "mul" -> return doMathOperation(command.substring(3, 4), parametes, registers, { a: Long, b: Long -> a * b })
        "ban" -> return doMathOperation(command.substring(3, 4), parametes, registers, { a: Long, b: Long -> a.and(b) })
        "bor" -> return doMathOperation(command.substring(3, 4), parametes, registers, { a: Long, b: Long -> a.or(b) })
        "set" -> return doMathOperationOnSet(command.substring(3, 4), parametes, registers, { a: Long, b: Long -> a })
        "gtr" -> return doMathOperation(command.substring(3, 4), parametes, registers, { a: Long, b: Long -> if (a > b) 1 else 0 })
        "eqr" -> return doMathOperation(command.substring(3, 4), parametes, registers, { a: Long, b: Long -> if (a == b) 1 else 0 })
        "gti" -> return doMathOperationOnI(command.substring(3, 4), parametes, registers, { a: Long, b: Long -> if (a > b) 1 else 0 })
        "eqi" -> return doMathOperationOnI(command.substring(3, 4), parametes, registers, { a: Long, b: Long -> if (a == b) 1 else 0 });
    }
    return registers;
}

fun doMathOperationOnSet(type: String, parametes: List<Long>, registers: List<Long>, function: (Long, Long) -> Long): List<Long> {
    var result = registers.toLongArray();
    if (type == "i") {
        result[parametes[2].toInt()] = function.invoke(parametes[0], parametes[1]);
    } else {
        result[parametes[2].toInt()] = function.invoke(registers[parametes[0].toInt()], parametes[1]);
    }
    return result.toList()
}

fun doMathOperationOnI(type: String, parametes: List<Long>, registers: List<Long>, function: (Long, Long) -> Long): List<Long> {
    var result = registers.toLongArray();
    result[parametes[2].toInt()] = function.invoke(parametes[0], registers[parametes[1].toInt()]);
    return result.toList()
}

fun doMathOperation(type: String, parametes: List<Long>, registers: List<Long>, function: (Long, Long) -> Long): List<Long> {
    var result = registers.toLongArray();
    if (type == "i") {
        result[parametes[2].toInt()] = function.invoke(registers[parametes[0].toInt()], parametes[1]);
    } else {
        result[parametes[2].toInt()] = function.invoke(registers[parametes[0].toInt()], registers[parametes[1].toInt()])
    }
    return result.toList()
}


fun main(args: Array<String>) {


    var lines = input.split("\n").map { it.trim() }.filter { it != "" };

    var ip = lines.get(0).split(" ").get(1).toInt();
    var code = lines.subList(1, lines.size).map { it.split(" ") }

    var loops = 0;//
    //1873396
   // var registers = listOf<Long>(5745418, 0, 0, 0, 0,0)
    //  var registers = listOf<Long>(2658765, 0, 0, 0, 0,0)

      var registers = listOf<Long>(1, 0, 0, 0, 0,0)

    var instructions = setOf<Int>();
    //var registers = listOf<Int>(0, 0, 0, 250, 16270103, 13);
    //var registers = listOf<Long>(0, 0, 256, 65536, 16270103, 25);
    //var registers = listOf<Long>(0, 0, 28443, 7281471, 3644524, 18);
    //var registers = listOf<Long>(0, 0, 49591, 12695433, 8521050, 18);

    while (true) {
        loops++;
        var lineNo:Int = registers.get(ip).toInt();
        instructions = instructions.plus(lineNo);
        if (lineNo >= code.size) {
            System.out.println(registers);
            return
        }
        var lineOfCode = code.get(lineNo.toInt());
        if(lineNo.toInt()==18){

            registers = registers.subList(0, 2).plus(registers.get(3)/256).plus(registers.subList(3, registers.size));
        } else if(lineNo.toInt()==28){
//            //System.out.print("dupa");
//            System.out.println(instructions.size);


        }


        System.out.print(lineNo)
        System.out.print("\t");
        System.out.print(lineOfCode)
        System.out.print("\t");
        System.out.print(registers)
        System.out.println()

       //
        // System.out.println(lineOfCode);
        registers = calculateLine(lineOfCode[0], lineOfCode.subList(1, 4).map { it.toLong() }, registers);

        registers = registers.subList(0, ip).plus(registers.get(ip) + 1).plus(registers.subList(ip + 1, registers.size));
    }

}


//b

//10551345 to low