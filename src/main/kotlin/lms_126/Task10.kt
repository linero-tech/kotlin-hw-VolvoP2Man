package lms_126

fun task10(): String {

    return """VAR X
        |VAL Password
        |Input email address
        |set.Min(int)=6
        |set.MaxLength(int)=24
        Println("Please enter password")
        |Input Password
        |Println("Pleas confirm your password")
        Input X
        |IF X=Password GoTo (17)
        |Println("your confirmation password didn't match the one you first entered, please re-enter it, without any changes from the original")
        |GoTo (13)
        |Println("Your account set up") 
    """.trimMargin()
}
