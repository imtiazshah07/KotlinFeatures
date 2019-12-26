package de.kotlin.first.tutorial

open class Animal(
    val name: String,
    var height: Double,
    var weight: Double
) {

    init {
        var regex = Regex(".*\\d+.*")

        require(!name.matches(regex)) { " Animal name cannot contain numbers." }

        require(height > 0) { "Height must be greater then zero" }

        require(weight > 0) { " Weight must be greater then zero" }
    }

    open fun getInfo(): Unit {
        println("${name} is ${height} tall and weight ${weight}")
    }
}
