fun main() {
    val multipleWords = "Вижиживуха"
    val NUM = 5
    val word = "Гаджишка делай гаджишка делаешь"
    val concatenatedString = "$NUM $word"
    println("multipleWords: $multipleWords, NUM: $NUM, word: $word, concatenatedString: $concatenatedString")
    when {
        NUM < 0 -> println("Вы сохранили отрицательное число")
        NUM > 0 -> println("Вы сохранили положительное число")
        else -> println("Вы сохранили нуль")
    }
}