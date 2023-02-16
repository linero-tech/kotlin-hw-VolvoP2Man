package lms_127

fun task6(base1: Double, base2: Double, height: Double): Double {


    val result = (base1 + base2) * height / 2
    println("The area of a trapezoid with the base 1 of $base1 , base 2 of $base2 and height of $height is $result")
    return result
}

fun main () {
task6( base1 = 10.0 ,base2 = 20.0, height = 96.0)
}