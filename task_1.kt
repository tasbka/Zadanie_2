
//Создать программу, выполняющую следующий функционал:
//- запрашивается количество строк и столбцов для двумерного массива
//- вводится необходимое количество трехзначных чисел (числа могут повторяться)
//- подсчитывается количество различных цифр в полученном массиве
//- на консоль выводится двумерный массив из введенных чисел и количество различных цифр используемых в данном массиве
//Например, для массива
//100   951   101   950
//519   999   155   501
//510   911   144   554
//выведется результат: В массиве использовано 5 различных цифр
fun main(args: Array<String>) {
    println("Введите количество строк:")
    val stroki = readln().toInt()
    println("Введите количество столбцов:")
    val stolb = readln().toInt()
    val array: Array<Array<Int>> = Array(stroki) {
        Array(stolb) {
            (100 .. 999).random()
        }
    }


    for (i in 0 .. stroki-1) {
        for (j in 0 .. stolb-1) print(array[i][j].toString() + "\t\t")
        println()
    }

    val unique = mutableSetOf<Char>()
    for (i in 0 .. stroki-1) {
        for (j in 0 .. stolb-1)  {
            val numbers = array[i][j].toString()
            for (char in numbers){
                unique.add(char)
            }

        }
    }

    println("Количество различных цифр: ${unique.size}")
}

