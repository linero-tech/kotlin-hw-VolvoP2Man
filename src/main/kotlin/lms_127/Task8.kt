package lms_127

fun task8(sentence: String, character: Char): Int {


    val result = sentence.count{it == character}
    return result
}

fun main () {
    println(task8(sentence = "Big, no huge, Volvo-BM diesel tractors", character = 'i' ))


}