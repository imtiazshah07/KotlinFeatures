package de.kotlin.first.tutorial

import java.lang.IllegalArgumentException

fun main(args: Array<String>) {

    //Exception Handling

    val divisor = 0

    try {
        if (divisor == 0) {
            throw IllegalArgumentException("Cannot divide by zeo")
        } else {
            println(" 5 /  $divisor =  ${5 / divisor}")
        }
    } catch (e: IllegalArgumentException) {
        println("${e.message}")

    }

}
