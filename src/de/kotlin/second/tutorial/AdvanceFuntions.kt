package de.kotlin.second.tutorial

//Higher Order functions and Functional Data type
// Higher Order functions : Return functions or accept function as parameter

/**
 *
 */
fun printFilteredString(list: List<String>, predicate: (String) -> Boolean) {
    list.forEach {
        it
        if (predicate(it)) {
            println("$it")
        }
    }
}

/**
 *
 */
fun printFilteredStringWithNull(list: List<String>, predicate: ((String) -> Boolean)?) {
    list.forEach {
        it
        if (predicate?.invoke(it) == true) {
            println("$it")
        }
    }
}

/**
 *
 */
val predicate: (String) -> Boolean = {
    it.startsWith("J")
}

/**
 *
 */
fun getPrintPredicate(): (String) -> Boolean {
    return { it.startsWith("J") }
}

/**
 *
 */
fun main() {
    val list = listOf<String>("Kotlin", "Java", "C++")

    //printFilteredString(list, {it.startsWith("K")})
    printFilteredString(list) {
        it.startsWith("K")
    }

    printFilteredStringWithNull(list, null)

    printFilteredString(list, predicate)

    printFilteredStringWithNull(list, getPrintPredicate())

    list.filter { it.startsWith("J") }.forEach { println(it) }

    val Newlist = listOf("Kotlin", "Java", "C++", null, null)

    println("**********************")

    Newlist.filterNotNull().filter { it.startsWith("J") }.forEach { println(it) }

    println("**********************")

    Newlist.filterNotNull().filter { it.startsWith("J") }.map { it.length }.forEach { println(it) }

    println("**********************")

    Newlist.filterNotNull().take(3).forEach { println(it) }

    println("**********************")

    Newlist.filterNotNull().takeLast(3).forEach { println(it) }

    println("**********************")

    Newlist.filterNotNull().associate { it to it.length }.forEach {
        println("${it.value} , ${it.key}")
    }

    println("**********************")

    var map = Newlist.filterNotNull().associate { it to it.length }

    println("First Value: ${Newlist.first()}  - Last Value: ${Newlist.last()} - Last Not Null Value: ${Newlist.filterNotNull().last()}")

    println("**********************")
    var language = Newlist.filterNotNull().findLast{ it.startsWith("Java")}

    println(language)
    println("**********************")


    var languageEmpty = Newlist.filterNotNull().findLast{ it.startsWith("Foo")}.orEmpty()

    println(languageEmpty)
    println("**********************")


}