package de.kotlin.first.tutorial

/**
 * Interface in with one boolean variable and one abstract method.
 */
// fun fly(distanceMile: Double): Unit  - Unit is void
interface Flyable {
    var flies: Boolean
    fun fly(distanceMile: Double): Unit
}