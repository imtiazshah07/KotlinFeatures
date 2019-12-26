package de.kotlin.second.tutorial

object EntityFactory{
     fun create() = EntityTwo("id", "name")
}

// Companion object
class EntityTwo(val id: String, val name: String){

    override fun toString(): String {
        return "id = $id || name = $name"
    }
}

fun main() {
    val entity = EntityFactory.create()
}