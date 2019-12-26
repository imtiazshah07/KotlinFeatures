package de.kotlin.second.tutorial


interface  IdProvider{
    fun getId() : String
}

// Companion object
class Entity private constructor(val id: String){


    companion object Factory : IdProvider{
        const val id = "id"
        override fun getId(): String {
            return "GenericId"
        }

        fun create() = Entity(getId())
    }
}



fun main() {
    //val entity = Entity.Companion.create()

    //val entity = Entity.create()

    val entity = Entity.Factory.create()
    Entity.id
}