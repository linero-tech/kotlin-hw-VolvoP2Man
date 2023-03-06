package lms_129

fun task8(number: Int): Int {

    val loop = false
    val numberClone = number
    val string = numberClone.toString()
    var charTS = '0'
    var stringToInt = ""
    var result = 0
    var get = 0
    val length = string.length
    var counter = 0

    while (!loop) {
        charTS = string[counter]
        stringToInt = charTS.toString()
        get += stringToInt.toInt()
        counter += 1

        if (counter == length) {
            break
        }
    }

    result += get

    return result
}

fun main(){
    println(task8(number = 123))
}