package de.kotlin.second.tutorial

import java.util.*

enum class SealedEntityType{
    HELP, EASY, MEDIUM, HARD;

    fun getFormatedName() = name.toLowerCase().capitalize()
}


object EntityFactorySealed{
    fun create(type: SealedEntityType): SealedEntity {
        val id = UUID.randomUUID().toString()
        val name = when(type){
            SealedEntityType.EASY -> type.name
            SealedEntityType.MEDIUM -> type.name
            SealedEntityType.HARD -> type.name
            SealedEntityType.HELP -> type.getFormatedName()
        }

        return when(type){
            SealedEntityType.EASY-> SealedEntity.Easy(id, name)
            SealedEntityType.MEDIUM -> SealedEntity.Medium(id, name)
            SealedEntityType.HARD  -> SealedEntity.Hard(id, name, 3f)
            SealedEntityType.HELP -> SealedEntity.Help
        }
    }
}

//Sealed Classes : limiting the base type extension by classes
sealed class SealedEntity() {

    data class Easy(val sId: String, val sName: String) : SealedEntity()
    data class Medium(val sId: String, val sName: String) : SealedEntity()
    data class Hard(val sId: String, val sName: String, val sMultiplier: Float) : SealedEntity()
    // Object declaration
    object Help : SealedEntity(){
        val name = "help"
    }
}


fun main() {
     val entity : SealedEntity = EntityFactorySealed.create(SealedEntityType.HARD)

    val msg = when(entity){
        SealedEntity.Help -> " Help Class"
        is SealedEntity.Easy -> " Easy Class"
        is SealedEntity.Medium -> " Medium Class"
        is SealedEntity.Hard -> " Hard Class"

    }

    println(msg)
}