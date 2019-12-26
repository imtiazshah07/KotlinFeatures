package de.kotlin.second.tutorial

//Controlflow
fun main() {
    var name: String = "Tutorial"
    var greeting: String? = null

    println(greeting)

    greeting = "Welcome,"

    if (greeting != null) {
        println("$greeting")
        println(greeting)
    } else {
        println("$name")
        println(name)
    }

    when (greeting) {
        null -> println("Hi")
        else -> println(greeting)
    }

    val greetingToPrint = if(greeting!=null) greeting else "Hello"
    println(greetingToPrint)


    val  greetingToPrintWhen = when(greeting){ null -> "Hi" else-> greeting}
    println(greetingToPrintWhen)

}