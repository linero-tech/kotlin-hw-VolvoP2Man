package lms_129

fun task1(a: Int, b: Int): Int {

    val a2 = a.toString()
    val b2 = b.toString()
    var result = 0
    var sudoResult = ""
        if (a >= b) {
            result = 0
        } else if (a < b) {
            sudoResult = a2 + b2
            result = sudoResult.toInt()
        } else {
            print("Error")
        }


    return result
}

fun main () {
    print(task1( a = 4 , b = 99 ))

}