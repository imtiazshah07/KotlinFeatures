package de.kotlin.first.tutorial

/**
 * Different conditional statement
 */
fun main(args:Array<String>){
    var isTrue: Boolean = false;

    if (true is Boolean) {
        println("True is boolean")
    }

    // Conditional Operators > < >= <= != , && || !

    val age = 8

    if (age < 5) {
        println("Go to preschool")
    } else if (age == 5) {
        println("Go to Kita")
    } else if ((age > 5) && (age <= 17)) {
        val grade = age - 5
        println("Go to grade $grade")
    } else {
        println(" Go to collage")
    }

    // When (Switch)

    when (age) {
        0, 1, 2, 3, 4 -> println(" Go to preschool")
        5 -> println(" Go to kita")
        in 6..17 -> {
            val grade = age - 5
            println("Go to grade $grade")
        }
        else -> println("Go to collage")
    }

}
