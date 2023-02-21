package lms_127

fun task10_1(assessments: String): Int {

    val result = assessments.length
    println("The machine took $result minutes")
    return result

}

fun task10_2(assessments: String): Char {


    val result = assessments[3]
    println("The quality assessment at minute number 4 was $result")
    return result
}



fun task10_3(assessments: String): Char {

    val result = assessments[2]
    println("The quality halfway was $result")
    return result


}

fun task10_4(assessments: String): String {

    val result = assessments.substring(0, 4)
    println("The first three assessments are $result")
    return result
}

fun main () {
    task10_1(assessments = "LMHHF")
    task10_2(assessments = "LMFHMF")
    task10_3(assessments = "LMFHM")
    task10_4(assessments = "LMFHM")
}