package lms_129

fun task6(number: Int): Int {

    var result = 0
    val sentence = number.toString()
    val length = sentence.length
    val loop = false
    var counter = 0
    val reverse = sentence.reversed()
   // println("control = $reverse")

    //Useless loop
    while (!loop) {
        counter += 1
        if (counter > length) {
            break
        }else{
            //d88 = sentence.first(string)
           // println("Test")
        }
    }

//println(counter)
    val result2 = reverse.toInt()
result += result2

    return result
}

fun main () {
    println(task6(number = 12345))
}