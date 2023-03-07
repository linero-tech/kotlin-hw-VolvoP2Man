package lms_129

fun task9(temperature: String): String {

    var result = ""
    var numberString = temperature
    val temperatureClone = temperature.uppercase()
    var number = 0
    var toInt = 0.0
    var toString = 0

        if (temperature.contains('C',ignoreCase = true)) {
            numberString = temperatureClone.substringBeforeLast('C')
            number = numberString.toInt()
            toInt += number * 1.8 + 32
            toString += toInt.toInt()
            result += toString.toString() + "F"





        } else if (temperature.contains('F', ignoreCase = true)) {
            numberString = temperatureClone.substringBeforeLast('F')
            number = numberString.toInt()
            toInt += (number -32) * 0.5556
            toString += toInt.toInt()
            result += toString.toString() + "F"



        }else{
            println("The input lacks acceptable unit, please re-enter the temperature with ether 'C' for Celsius or 'F' for Fahrenheit, at the end")


        }


    return result
}

fun main(){
    println(task9(temperature = "100c"))
}