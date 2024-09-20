//Имеется массив целых чисел из 5-и строк и 5-и столбцов. Выяснить, симметричен ли он относительно главной диагонали.
//То есть - элемент 1,2 равен элементу 2,1. Элемент 1,3 равен элементу 3,1 и т.д.
//Например массив
//5  9  6  7  2
//9  8  4  5  3
//6  4  3  8  7
//7  5  8  4  8
//2  3  7  8  1
//является симметричным относительно главной диагонали

fun main(args: Array<String>) {

    //ЭТО МАТРИЦА ДЛЯ ПРОВЕРКИ!!!
    val matrix = arrayOf(
        intArrayOf(1, 2, 3, 4, 5),
        intArrayOf(2, 1, 4, 3, 6),
        intArrayOf(3, 4, 1, 2, 7),
        intArrayOf(4, 3, 2, 1, 8),
        intArrayOf(5, 6, 7, 8, 1)
    )

    //val array: Array<Array<Int>> = Array(5) {
     //   Array(5) {
    //    (0..9).random()
    // }
    //}

    for (i in 0..4) {
        for (j in 0..4) print(matrix[i][j].toString() + "\t")
        println()
    }
    var symmetric = true
    val n = matrix.size
    var count = 0;

    // Проверка на симметрию
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            if (matrix[i][j] != matrix[j][i]) {
                symmetric = false
                break

            }
        }

    }
    if (symmetric) {
        println("Массив симметричен относительно главной диагонали")
    } else {
        println("Массив не симметричен относительно главной диагонали")
    }
}