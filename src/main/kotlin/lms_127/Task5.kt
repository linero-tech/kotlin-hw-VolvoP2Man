package lms_127

fun task5(valueForA: Int, valueForB: Int): Pair<Int, Int> {
    // Do not change or delete these variables
    var a = valueForA
    var b = valueForB

    val dingus = b

    b = a
    
    a = dingus

    // Do not erase or change this statement
    return Pair(a, b)
}

fun main () {
    task5( valueForA = 9, valueForB = 1)
}