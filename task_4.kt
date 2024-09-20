//Создать приложение, в котором пользователь дает на вход два числовых массива, числа в массиве могут повторяться.
// На выходе приложение выдает пересечение этих массивов. Например, на входе [1, 2, 3, 2, 0] и [5, 1, 2, 7, 3, 2, 2].
// На выходе должны получить [1, 2, 2, 3]. То есть учитывается количество повторений чисел в массиве. Число 2 в одном массиве повторялось два раза, в другом - три.
// Значит в итоговом массиве число два должно быть два раза
fun main() {
    println("Введите количество элементов в первом массиве:")
    val element1 = readln().toInt()
    println("Введите количество элементов во втором массиве:")
    val element2 = readln().toInt()

    val array1 = Array(element1){ (0 .. 9).random()
    }
    val array2 = Array(element2){ (0 .. 9).random()
    }
    println("Первый массив:")
    for (i in 1 .. element1-1) {
    print(array1[i].toString()+" ")
    }
    println("\nВторой массив:")
    for (j in 1 .. element2-1) {
        print(array2[j].toString()+" ")
    }

    val result = mutableListOf<Int>()

    for (i in 0..array1.size-1) {
        for (j in 0..array2.size-1) {
            if (array1[i] == array2[j]) {
                result.add(array1[i])
                break
            }
        }
    }

    print("\nСовпадения в массивах:\n"+result)
}