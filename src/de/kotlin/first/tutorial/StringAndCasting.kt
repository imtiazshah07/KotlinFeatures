package de.kotlin.first.tutorial


fun main(args:Array<String>){
    var letterGrade: Char = 'A'

    println(" A is a Char : $letterGrade")
    println(" A is Char ${letterGrade is Char}")

    // Casting
    println("3.14 to Int : " + (3.15.toInt()));
    println("A to Int: " + ('A'.toInt()))
    println("65 gto Char " + (65.toChar()))

    // Strings
    val myName = "My Name"
    val longString = """THis is an log string with some new lines
        |THis is an log string with some new lines
        |THis is an log string with some new lines
        |THis is an log string with some new lines
    """.trimMargin()

    var fName: String = "Syed"
    var lName: String = "Imtiaz"

    var fullName = fName + " " + lName

    println("Full Name: $fullName")

    println("1+2 = ${1 + 2}")

    println("String Length = ${longString.length}")

    var str1 = "A random string"
    var str2 = "a random string"

    println("String equal: ${str1.equals(str2)}")
    println(" Compare A to B : ${str1.compareTo(str2)}")
    println(" Compare A to B : ${"A".compareTo("B")}")

    println("second index: ${str1.get(2)}");
    println("second index: ${str1[2]}")

    println(" Index 2 - 7 : ${str1.subSequence(2, 7)}")

    println(" Contains: ${str1.contains("random")}")


}
