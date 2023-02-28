package lms_129

fun task3(number: Int): Int {
    var result = 1

    for (i in number downTo 1) {
        result *= i



    }




    return result
}

fun main(){
    print(task3(number = 9))

}