package lms_127

fun task8(sentence: String, character: Char): Int {


    val result = sentence.count{it == character}
    println ("the letter I occurs $result times in the sentence I code in Kotlin")
    return result
}

fun main () {
    task8(sentence = "Big, no huge, Volvo-BM diesel tractors", character = 'i' )


}