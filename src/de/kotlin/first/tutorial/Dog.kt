package de.kotlin.first.tutorial

class Dog(
    name: String,
    height: Double,
    weight: Double,
    var owner: String
) : Animal(name, height, weight) {


    override fun getInfo(): Unit {
        println("${name} is ${height} tall and weight ${weight} and owner is ${owner}")

    }
}
