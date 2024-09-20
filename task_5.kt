fun main() {
    val words = mutableListOf<String>()
val n=0
    println("Введите слова : ")

   for (n in 0..6 ){
        val input = readLine()
        if (input.isNullOrEmpty()) break // Завершение ввода при пустой строке
        words.add(input)
    }
    val result = mutableListOf<List<String>>()

    for (word in words) {
        val sortedWord = word.toCharArray().sorted().joinToString("")
        var found = false

        // Проверяем, существует ли уже группа для отсортированного слова
        for (i in result.indices) {
            if (sortedWord == result[i][0].toCharArray().sorted().joinToString("")) {
                result[i] = result[i] + word // Добавляем слово в существующую группу
                found = true
                break
            }
        }

        // Если группа не найдена, создаем новую
        if (!found) {
            result.add(listOf(word))
        }
    }

    // Печатаем результат
    println("Группы слов:")
    for (group in result) {
        println(group.joinToString(", "))
    }
}