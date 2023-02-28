package lms_129

fun task3(number: Int): Int {
    var result = 1

    for (Dave in number downTo 1) {
        result *= Dave


    }




    return result
}

fun main(){
    print(task3(number = 9))

}