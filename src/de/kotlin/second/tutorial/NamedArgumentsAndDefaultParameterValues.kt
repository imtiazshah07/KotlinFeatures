package de.kotlin.second.tutorial

/**
 * vararg parameter : variable number of parameters
 */

fun main() {

    operateListArgument("Hello", listOf())

    varargArgument("Hello", "Kotlin", "Programming", "Language")

    println("****************")

    var things = arrayOf("Kotlin", "Programming", "Comic", "Language")
    varargArgument("Hello", *things) // Spread Operator

    //Named Arguments
    namedArgumentFunction(greeting = "Hello", name = "MyName")

    namedArgumentFunction(name = "MyName", greeting = "Hello")

    // Default Parameter Values
    //namedArgumentFunction(greeting="Hello") //No value passed for parameter 'name'

    defaultValueFunction("Hi")

    defaultValueFunction()
    println("****************")

    varargArgument(greeting="Hello", items= *things)


}

fun defaultValueFunction(greeting: String = "Hello,", name: String = "MyName") = println("$greeting, $name")

/**
 *
 */
fun namedArgumentFunction(greeting: String, name: String) = println("$greeting, $name")

/**
 *
 */
fun operateListArgument(greeting: String, items: List<String>) {
    items.forEach { item ->
        println("$greeting, $item")
    }
}

/**
 *
 */
fun varargArgument(greeting: String, vararg items: String) {
    items.forEach { item ->
        println("$greeting, $item")
    }
}