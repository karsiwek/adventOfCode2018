package karsiwek.day13

import java.util.ArrayList

var input3 = """
/>---<\
|     |
v /->-+<\
| |   v v
\-+---/ |
  |     ^
  \---->/"""

var input5 = """
/>---<\
|     |
v /-->+<\
| |   ^ v
\-+---/ |
  |     ^
  \---->/"""

var input4= """
/>-<\
|   |
| /<+-\
| | | v
\>+</ |
  |   ^
  \<->/
"""
fun solveShit2(input: String): Any {
    var state = input
            .split("\n")
            .filter { it != "" };
    var map = state.map {
        it.replace('>', '-')
                .replace('<', '-')
                .replace('^', '|')
                .replace('v', '|')
    }

    var bolids: Set<Pair<Pair<Int, Int>, Pair<Char, Char>>> = setOf();
    for (i in (0..state.size-1)) {
        for (j in (0..state.get(i)!!.length-1)) {
            if (state.get(i)!!.get(j) == '<' || state.get(i)!!.get(j) == '>' || state.get(i)!!.get(j) == '^' || state.get(i)!!.get(j) == 'v') {
                bolids = bolids.plus(Pair(Pair(j, i), Pair(state.get(i)!!.get(j), 'l')));
            }
        }
    }
    var iterations = 1;
    printMap(map, bolids);
  //  while(iterations<10){
   while (true) {

        var newBolidSet = (bolids.sortedBy { it.first.second *1000000  + it.first.first})

        var i=-1;
       var unprocessed = newBolidSet;
       var processed = listOf<Pair<Pair<Int, Int>, Pair<Char, Char>>>()
       while(unprocessed.size>0) {
           var current = mapBolid(unprocessed.get(0)!!, map);
           if(unprocessed.size>1){
               unprocessed = unprocessed.subList(1, unprocessed.size);
           } else {
               unprocessed = listOf();
           }

           if(processed.filter { it.first == current.first }.size>0){
               processed = processed.filter { it.first != current.first };
               continue;
           }

           if(unprocessed.filter { it.first == current.first }.size>0){
               unprocessed = unprocessed.filter { it.first!= current.first };
               continue;
           }

           processed = processed.plus(current);

       }


       bolids = processed.toSet();
       // printMap(map, bolids);
//System.out.println("tick")

        if(bolids.size<=1){
            printMap(map, bolids);
            System.out.print(bolids);
            return iterations;
        }
        iterations++;
    }
    return iterations;
}

private fun mapBolid(bolid: Pair<Pair<Int, Int>, Pair<Char, Char>>, newStateMap: List<String>): Pair<Pair<Int, Int>, Pair<Char, Char>> {
    var nextField: Char = ' '
    var nextCoords: Pair<Int, Int> = Pair(1, 1);
    if (bolid.second.first == '^') {
        nextField = newStateMap.get(bolid.first.second - 1)!!.get(bolid.first.first);
        nextCoords = Pair(bolid.first.first, bolid.first.second - 1)
    } else if (bolid.second.first == 'v') {
        nextField = newStateMap.get(bolid.first.second + 1)!!.get(bolid.first.first);
        nextCoords = Pair(bolid.first.first, bolid.first.second + 1)
    } else if (bolid.second.first == '<') {
        nextField = newStateMap.get(bolid.first.second)!!.get(bolid.first.first - 1);
        nextCoords = Pair(bolid.first.first - 1, bolid.first.second)
    } else if (bolid.second.first == '>') {
        nextField = newStateMap.get(bolid.first.second)!!.get(bolid.first.first + 1);
        nextCoords = Pair(bolid.first.first + 1, bolid.first.second)
    }

    var nextDir = bolid.second;
    if (nextField == '/') {
        if (bolid.second.first == '>') {
            nextDir = Pair('^', bolid.second.second);
        } else if (bolid.second.first == 'v') {
            nextDir = Pair('<', bolid.second.second);
        } else if (bolid.second.first == '<') {
            nextDir = Pair('v', bolid.second.second);
        } else if (bolid.second.first == '^') {
            nextDir = Pair('>', bolid.second.second);
        }
    } else if (nextField == '\\') {
        if (bolid.second.first == '>') {
            nextDir = Pair('v', bolid.second.second);
        } else if (bolid.second.first == 'v') {
            nextDir = Pair('>', bolid.second.second);
        } else if (bolid.second.first == '<') {
            nextDir = Pair('^', bolid.second.second);
        } else if (bolid.second.first == '^') {
            nextDir = Pair('<', bolid.second.second);
        }
    } else if (nextField == '+') {
        if (bolid.second.first == '>') {
            if (bolid.second.second == 'r') {
                nextDir = Pair('v', 'l');
            } else if (bolid.second.second == 'l') {
                nextDir = Pair('^', 's');
            } else if (bolid.second.second == 's') {
                nextDir = Pair(bolid.second.first, 'r');
            }
        } else if (bolid.second.first == 'v') {
            if (bolid.second.second == 'r') {
                nextDir = Pair('<', 'l');
            } else if (bolid.second.second == 'l') {
                nextDir = Pair('>', 's');
            } else if (bolid.second.second == 's') {
                nextDir = Pair(bolid.second.first, 'r');
            }
        } else if (bolid.second.first == '<') {
            if (bolid.second.second == 'r') {
                nextDir = Pair('^', 'l');
            } else if (bolid.second.second == 'l') {
                nextDir = Pair('v', 's');
            } else if (bolid.second.second == 's') {
                nextDir = Pair(bolid.second.first, 'r');
            }
        } else if (bolid.second.first == '^') {
            if (bolid.second.second == 'r') {
                nextDir = Pair('>', 'l');
            } else if (bolid.second.second == 'l') {
                nextDir = Pair('<', 's');
            } else if (bolid.second.second == 's') {
                nextDir = Pair(bolid.second.first, 'r');
            }
        }

    }

    return Pair(nextCoords, nextDir)
}


fun main(args: Array<String>) {

    System.out.println(solveShit2(input2));

}


