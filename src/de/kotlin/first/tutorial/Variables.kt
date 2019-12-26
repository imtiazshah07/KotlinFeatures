package de.kotlin.first.tutorial

fun main(args: Array<String>) {
    // val is like a final (Immutable) in java values cannot be reassigned and you will get errror 'Val cannot be reassigned'
    val name = "User Name";

    // var is Mutable / changeable.
    var address = "Home Address";

    var bigInt: Int = Int.MAX_VALUE
    var smallInt: Int = Int.MIN_VALUE

    println(" Maximum Integer Value :" + bigInt + " and Minimum Integer Value: " + smallInt)
    println(" Maximum Integer Value : $bigInt and Minimum Integer Value: $smallInt")
    println(" Maximum Long Value : ${Long.MAX_VALUE} and Minimum Long Value: ${Long.MIN_VALUE}")
    println(" Maximum Double Value : ${Double.MAX_VALUE} and Minimum Double Value: ${Double.MIN_VALUE}")
    println(" Maximum Float Value : ${Float.MAX_VALUE} and Minimum Float Value: ${Float.MIN_VALUE}")
    println(" Maximum Short Value : ${Short.MAX_VALUE} and Minimum Short Value: ${Short.MIN_VALUE}")
    println(" Maximum Byte Value : ${Byte.MAX_VALUE} and Minimum Byte Value: ${Byte.MIN_VALUE}")
    println(" Maximum Char Value : ${Char.MAX_VALUE} and Minimum Char Value: ${Char.MIN_VALUE}")

}