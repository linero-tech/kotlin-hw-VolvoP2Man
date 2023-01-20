package lms_126

fun task9(): String {

    return """VAR X 
        VAR Balance
        VAL SC=000000
        Println("PIN Required to Continue, Please enter your PIN")
        INPUT SC1
        IF SC1=SC SKIP TO LINE 19
         Println("Access denied, Wrong PIN, Try Again")
         INPUT SC2 
         IF SC2=SC SKIP TO LINE 19
         Println("Access denied, Wrong PIN, You have one more try,Try Again")
         INPUT SC3
         IF SC3=SC SkIP TO LINE 19
         Println("Access denied, Wrong PIN")
         SKIP TO LINE 8
         CLEAR SCREEN
         BALANCE=500
         Println("Your Balance is")
         Println BALANCE
         Println("How much would you like to withdraw from your account?")
         INPUT X
         CLEAR SCREEN
         Println("withdrawing")
         Println X
         BALANCE-X=BALANCE
         Println("Your current balance is now")
         Println BALANCE
         Println("Would you like to make another withdraw?")
         INPUT N
       IF N=1 SKIP TO LINE 21
       Println("Thank you, have a nice day")
    """.trimMargin()

}
