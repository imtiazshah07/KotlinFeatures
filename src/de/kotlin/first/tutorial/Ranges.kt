package de.kotlin.first.tutorial

fun main(args:Array<String>){
    // Ranges
    val oneTo10 = 1..10
    val alpha = "A".."Z"

    println(" R in Alpha : ${"R" in alpha}")

    val tenToOne = 10.downTo(1)
    val twoTo20 = 2.rangeTo(20)
    val range3 = oneTo10.step(3)

    for (x in range3) println("Range 3: $x")

    for (x in tenToOne.reversed()) println("Reverse: $x")
}
