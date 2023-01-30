package lms_127

fun task10_1(assessments: String): Int {

    val assessments = "LMHHF"
    val result = assessments.length
    println("The machine took $result minutes")
    return result

}

fun task10_2(assessments: String): Char {

    val assessment = "LMFHMF"
    val result = assessment[3]
    println("The quality assessment at minute number 4 was $result")
    return result
}

fun task10_3(assessments: String): Char {

    val assessment = "LMFHM"
    val result = assessment[2]
    println("The quality halfway was $result")
    return result


}

fun task10_4(assessments: String): String {

    val assessment = "LMFHM"
    val result = assessment.substring(0, 4)
    println("The first three assessments are $result")
    return result
}
