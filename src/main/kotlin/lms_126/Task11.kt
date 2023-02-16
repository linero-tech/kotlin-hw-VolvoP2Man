package lms_126

fun task11(): String {

    return """
       var celsius = ""
       var fahrenheit =""
       var kelvin =""
       Input "input temp with unit"
       if input contains C than input = celsius 
       fahrenheit = input * 1.8 + 32
       kelvin = input + 272.15
       print ("fahrenheit and kelvin")
       if input contains F input = Fahrenheit
       celsius = input (-32) * 1.5556
       kelvin = celsius +272.15
       print ("celsius and fahrenheit")
       if input contains K input = Kelvin
       celsius = input -272.15
       fahrenheit = celsius *1.8 +32
       print ("celsius and fahrenheit")
       Else
       pritln("temp unit not found")
      
    """.trimMargin()
    //original solution
    /*VAR K=272.15
VAR C
VAR F=C*1.8 + 32
VAR X
Println(“you have 6 options for conversions”) 
Println(“1 Celsius to Fahrenheit”)
Println(“2 Fahrenheit to Celsius”)
Println(“3 Kelvin to Celsius”)
Println(“4 Celsius to Kelvin”)
Println(“5 Kelvin to Fahrenheit”)
Println(“6 Fahrenheit to Kelvin”)
Println(“Please input the the number which corresponds with the units you want to convert”)  
INPUT X
IF X = 1 then GoTo 27
IF X = 2 then GoTo 32
IF X = 3 then GoTo 37
IF X = 4 then GoTo 42
IF X = 5 then GoTo 47
IF X = 6 then GoTo 52
Clear Screen
IF X > 6 GoTo 11
IF X < 1 GoTo 11
Celsius to Fahrenheit
INPUT C
CALCULATE F by C*1.8 + 32
Println F
GoTo 58
Fahrenheit to Celsius
INPUT F
CALCULATE C by (F-32)*0.5556
Println C
GoTo 58
Kelvin to Celsius
INPUT K
CALCULATE C by K-272.15
Println K
GoTo 58
Celsius to Kelvin
INPUT C
CALCULATE K by C+273.15
Println K
GoTo 58
Kelvin to Fahrenheit
INPUT K
CALCULATE F by (K-272.15)*1.8 + 32
Println F
GoTo 58
Fahrenheit to Kelvin
INPUT F
CALCULATE K by (F-32)*0.5556 + 273.15 
Println K */


}
