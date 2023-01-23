package lms_126

fun task11(): String {

    return """VAR K=272.15
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
IF X = 1 then GoTo 25
IF X = 2 then GoTo 30
IF X = 3 then GoTo 35
IF X = 4 then GoTo 40
IF X = 5 then GoTo 45
IF X = 6 then GoTo 50
Clear Screen
IF X > 6 GoTo 9
IF X < 1 GoTo 9
*//Celsius to Fahrenheit//
INPUT C
CALCULATE F by C*1.8 + 32
Println F
GoTo 56
*//Fahrenheit to Celsius// 
INPUT F
CALCULATE C by (F-32)*0.5556
Println C
GoTo 56
*//Kelvin to Celsius//
INPUT K
CALCULATE C by K-272.15
Println K
GoTo 56
*//Celsius to Kelvin//
INPUT C
CALCULATE K by C+272.15
Println K
GoTo 56
*//Kelvin to Fahrenheit// 
INPUT K
CALCULATE F by (K-272.15)*1.8 + 32
Println F
GoTo 56
*//Fahrenheit to Kelvin//
INPUT F
CALCULATE K by (F-32)*05556 + 272.15 
Println K
"""
}
