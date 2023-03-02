package lms_129

fun task4(): Int {

    var result = 0
    var number = 10
    val factor = 5
    var oddBall = 0
    var stretch = 0
    //it was at this point where I got frustrated to the point of considering making a hole in the wall, sorry for the bad language.
    var rubberDuck = 0


   for (oddBall in number downTo 1) {
       //println(oddBall)
       if (oddBall % factor == 0)
           rubberDuck += factor
       stretch += rubberDuck
       //println(oddBall)
   }

    result += stretch / factor
 /*   number + 1
for (i in 0 until number ) {
    if (number2 % factor == 0) {
        println()
    }

}*/
    return result
}

fun main (){
    print(task4())
}