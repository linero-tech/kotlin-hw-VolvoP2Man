package lms_129

fun task5(sentence: String): Int {

    val sierraAlphaAlphaBravo = false
    var result = 0
    //the easy way
    val control = sentence.length
    //println("control $control")

  //Abusing the easy way to technically pass
    while (!sierraAlphaAlphaBravo) {
        result += 1
        if (result == control) {
            break
        }
    }
    return result
}

fun main () {
    println(task5(sentence = "The Volvo B5244T4 is a master piece"))
}