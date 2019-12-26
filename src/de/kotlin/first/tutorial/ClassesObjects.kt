package de.kotlin.first.tutorial

// No static methods
//Classes are final

fun main(args: Array<String>) {
    val bowser = Animal("Bowser", 20.0, 13.5)
    bowser.getInfo()

    // IllegalArgumentException:  Animal name cannot contain numbers.
    // var loin = Animal("l0in", 20.2, 14.5)
    //loin.getInfo()

    var dog = Dog("puppi", 20.3, 18.3, "dogowner")
    dog.getInfo()

    // Interfaces
    val tweety = Bird("Tweety", true)
    tweety.fly(10.0)


    // null safety
    //Null can not be a value of a non-null type String
    //var nullVal: String = null
    var nullVal: String? = null

    fun returnNull(): String? {
        return null
    }

    var newNullVal = returnNull()
    //Smart cast
    if (newNullVal != null) {
        println(" newNullVal.length")
    }

    //force null assignment
    //var nullValThree = newNullVal!!.length
   // var nulValFour: String = returnNull()?:" No Name"
}



