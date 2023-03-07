package lms_129

fun task9(temperature: String): String {

    var result = ""
    val loop = false
    var numberString = temperature
    var temperatureClone = temperature.uppercase()
    var number = 0

    while(!loop){
        if (temperature.contains('C',ignoreCase = true)) {
            numberString = temperatureClone.substringBeforeLast('C')
            number = numberString.toInt()
            result += number * 1.8 + 32
            break



        } else if (temperature.contains('F', ignoreCase = true)) {
            numberString = temperatureClone.substringBeforeLast('F')
            number = numberString.toInt()
            result += (number -32) * 0.5556
            break

        }else{
            println("The input lacks acceptable unit, please re-enter the temperature with ether 'C' for Celsius or 'F' for Fahrenheit, at the end")
            break

        }
    }

    return result
}

fun main(){
    println(task9(temperature = "100c"))
}