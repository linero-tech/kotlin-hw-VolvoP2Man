package lms_129

fun task7(a: Int, b: Int): Int {

    var loop = false
    var result = 0
    var counter = 0
    var i = b

    while(!loop) {
        if (a == 0 && b == 0) {
            result = 1
            break
        }

        counter += 1
        i += i * b
        if (counter == a) {
            break
        }

    }
    i /= b
    i /= 2
result = i
    return result
}


fun main(){
   println(task7(a = 2, b = 3))
}