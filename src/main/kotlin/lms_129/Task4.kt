package lms_129

fun task4(): Int {

    var result = 0
    var number = 10
    val factor = 5
    var oddBall = 0
    var stretch = 0
    var rubberDuck = 0


   for (oddBall in number downTo 1) {
       //println(oddBall)
       if (oddBall % factor == 0)
           rubberDuck += factor
       stretch += rubberDuck
       //println(oddBall)
   }

    result += stretch / factor

    return result
}

fun main (){
    print(task4())
}