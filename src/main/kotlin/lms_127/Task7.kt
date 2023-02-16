package lms_127

fun task7(sentence: String): Int {

    val result = sentence.length
    println("The sentence, $sentence has $result characters, including spaces")
    return result
}

fun main () {
task7(sentence = "The Volvo B5244T5 is 5 cylinders, 2,4 liters of pure perfection")
}