package lms_126

fun task4(): String {

    return """VAL X
        |VAL Y 
        IF X>Y SKIP to LINE 10
        |println("Y has greater value than X")
        |SKIP to Line 11
        println("X has greater Value than Y) 
    """.trimMargin()
}
