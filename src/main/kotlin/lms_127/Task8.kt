package lms_127

fun task8(sentence: String, character: Char): Int {

    val sentence = "I code in KOTLIN"
    val result = sentence.count{it == 'I'}
    println ("the letter I occurs $result times in the sentence I code in Kotlin")
    return result
}

fun main () {
    val sentence = "I code in KOTLIN"
    val result = sentence.count{it == 'I'}
    println ("the letter I occurs $result times in the sentence I code in Kotlin")
}