package de.kotlin.second.tutorial

// Extension Properties and Extension Methods

sealed class ExtEntity() {

    data class Easy(val sId: String, val sName: String) : ExtEntity()
    data class Medium(val sId: String, val sName: String) : ExtEntity()
    data class Hard(val sId: String, val sName: String, val sMultiplier: Float) : ExtEntity()
    // Object declaration
    object Help : ExtEntity(){
        val name = "help"
    }
}

fun ExtEntity.Medium.printInfo(){
    println("Medium class: ${sId}")
}

