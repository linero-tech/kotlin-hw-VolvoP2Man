package lms_129

fun task6(number: Int): Int {

    val sentence = number.toString()
    val loop = false
    var counter = 0
    var reverse = ""


    //Pretty Useless loop, in my opinion, but I don't like doing math so, here we go
    while (!loop) {
        counter += 1
        if (counter == 2) {
            break
        }else{
            reverse = sentence.reversed()
        }
    }

//println(counter)
   val result = reverse.toInt()


    return result
}

fun main () {
    println(task6(number = 12345))
}