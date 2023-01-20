package lms_126

fun task8(): String {

    return """VAR X
INPUT X
VAL Y=3
VAL Z=5
VAR V = X/Y
VAR G = X/Z
IF X = 3 than Println(“Foo”)
IF X = 5 than Println(“Bar”)
IF V = 3 than Println(“Foo”)
IF V = 5 than Println(“Bar”)
IF G = 3 than Println(“Foo”)
IF G = 5 than Println(“Bar”)
V/3=V
IF V = 1 than SKIP TO LINE 21
IF V < 1 than SKIP TO LINE 12
SKIP LINE TO 17
G/2=G
IF G = 1 than SKIP TO LINE
IF G<1 SKIP TO LINE 25
SKIP LINE TO 21
IF G=1 Both V=1 Println(“FooBar”) SKIP TO LINE 29
IF V = 1 Than Println(“Foo”)
IF G = 1 Than Println(“Bar”) 
Println("Qix")
"""
}
