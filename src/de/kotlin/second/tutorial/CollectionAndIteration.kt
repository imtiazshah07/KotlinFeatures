package de.kotlin.second.tutorial

/**
 * Collection and Iterations
 * Arrays, List and Map
 */

fun main() {
    //Arrays
    val interestingThing = arrayOf("Kotlin", "Programming", "Books")

    println(interestingThing.size)
    println(interestingThing[2])
    println(interestingThing.get(2))

    //Normal approach
    for(it in interestingThing){
        println(it)
    }
    println("*********************")
    //Functional Approach
    interestingThing.forEach { it
        println(it)
    }
    println("*********************")
    interestingThing.forEach { it -> println(it) }

    println("*********************")
    interestingThing.forEachIndexed{ index, it -> println("$it is at index $index")}

    println("*********************")

    // List
    var iterestingThingAsListOf = listOf("Kotlin", "Programming", "Book", "Playground")
    operateList("Hello", iterestingThingAsListOf)

   // iterestingThingAsListOf.get(0) / [0]

    iterestingThingAsListOf.forEach{ it -> println(it)}

    println("*********************")

    //Map
    var interestingThingAsMap = mapOf(1 to "a", 2 to "b", 3 to "c",4 to "d",5 to "e")
    interestingThingAsMap.forEach{ key, value -> println("key is $key and value is $value")}

    //Mutable and Immutable collection type (by default is Immutable)

    val mutableInterestingThing = mutableListOf("Kotlin", "Programming", "Book", "Playground")
    mutableInterestingThing.add("VideoGame")
    mutableInterestingThing.forEach { it -> println(it) }

    var mutableInterestingThingAsMap = mutableMapOf(1 to "a", 2 to "b", 3 to "c",4 to "d",5 to "e")
    mutableInterestingThingAsMap.put(6, "f")
    mutableInterestingThingAsMap.forEach{ key, value -> println("key is $key and value is $value")}


}

/**
 *
 */
fun operateList(greeting: String, items: List<String>){
    items.forEach{ item ->
        println("$greeting, $item")
    }
}