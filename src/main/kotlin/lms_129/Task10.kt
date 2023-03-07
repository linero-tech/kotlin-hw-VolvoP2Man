package lms_129

fun task10(password: String): Boolean {

    var result = false
    val length = password.length
    var isLongButNoTo = false
    var character = false

    if (length <= 10 && length >= 6) {
        isLongButNoTo = true
    }else{
        println("Password is $length long")
        println("Password is ether to long or to short, it has to be between 6 and 10 characters")
    }

    if (password.contains('$') || password.contains('#') || password.contains('@')) {
        character = true
    }else{
        println("password $password , doesn't contain '#' or '$' or '@'")
    }

    if (isLongButNoTo == true && character == true){
        result = true
    }



    return result
}

fun main(){
    println(task10(password = "#clocksonS"))
}