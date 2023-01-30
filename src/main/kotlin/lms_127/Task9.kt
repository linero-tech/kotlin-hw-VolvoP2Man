package lms_127

fun task9(sentence: String, character: Char): Boolean {

    val sentence = "I code In KOTLIN"
    val result = sentence.contains('i', ignoreCase = true)
    println("result is $result ")
    return result
}

fun main () {
    val sentence = "I code In KOTLIN"
    val result = sentence.contains('i', ignoreCase = true)
    println("result is $result ")
}