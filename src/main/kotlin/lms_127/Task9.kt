package lms_127

fun task9(sentence: String, character: Char): Boolean {


    val result = sentence.contains(character, ignoreCase = true)
    println("result is $result ")
    return result
}

fun main () {
 task9(sentence = "Two Turbos are better than one, that is why the Volvo D5244T11 comes with two being run in sequence", character = 'i')
    }
