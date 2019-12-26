package de.kotlin.first.tutorial

/**
 * Class implement Flyable interface with one default boolean value and override fly abstract method
 *
 */
class Bird constructor(val name: String, override var flies: Boolean = true) :
    Flyable {

    override fun fly(distanceMile: Double): Unit {
        if (flies) {
            println("$name is going to fly for $distanceMile miles")
        }
    }
}