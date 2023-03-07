package lms_129

fun task9(temperature: String): String {

    var result = ""
    val loop = false
    var fahrenheit = false
    var Celsius = false
    var c = 0
    var f = 0
    var numberString = temperature
    var number = 0
    val fahrenheitTemp = ""

    while(!loop){
        if (temperature.contains('C',ignoreCase = true)) {
            numberString = temperature.substringBeforeLast('C')
            number = numberString.toInt()



        } else if (temperature.contains('F', ignoreCase = true)) {
            numberString = temperature.substringBeforeLast('F')
            number = numberString.toInt()

        }else{

        }
    }

    return result
}

fun main(){
    println(task9(temperature = "69C"))
}