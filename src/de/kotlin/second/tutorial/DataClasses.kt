package de.kotlin.second.tutorial

//Data class: are kotlin way of providing very concise immutable data types
//defining a class as data class will auto generated method like equals, hashcode and to string
// we can override equal and hashCode method of class

fun main() {
     var objectOne : String = "A"
     var objectTwo : String = "A"

    // its also provide copy constructors - var objectTwo = objectOne.copy

    //referencial comparasion with ===
   // if(objectOne === objectTwo)

    if( objectOne == objectTwo){
        println("Objects are equal")
    }
    else {
        println("Object are not equal")
    }
}