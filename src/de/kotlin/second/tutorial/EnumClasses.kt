package de.kotlin.second.tutorial

import java.util.*

/**
 *
 */
enum class EntityType {
    EASY, MEDIUM, HARD;

    fun gertDoemattedName() = name.toLowerCase().capitalize()
}

/**
 *
 */
object EntityFactoryTwo {
    fun create(type: EntityType): EntityTwo {
        val id = UUID.randomUUID().toString()
        val name = when (type) {
            EntityType.EASY -> type.name
            EntityType.HARD -> "Hard"
            EntityType.MEDIUM -> "Medium"
        }

        return EntityTwo(id, name)
    }
}

/**
 *
 */
fun main() {
    val entity = EntityFactoryTwo.create(EntityType.EASY)
    println(entity.id)
    println(entity.name)

}

//