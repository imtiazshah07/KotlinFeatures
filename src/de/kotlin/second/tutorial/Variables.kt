package de.kotlin.second.tutorial

//Top level variables
val topLevelVariables : String = "Its top level variables"
var greeting: String = "Welcome,"

//Nullable variables / Not nullable variables
var notNullableVariable: String = "Not Nullable Variable"
var nullableVariable: String? = "Nullable Variable"

//Type Inferences
var typeInferencesOne = "Type Inteferences"
var typeInferencesTwo = 10

var nullableString = null
var nullableStringTwo : String? = null

fun main(args:Array<String>){
    //val - final variables
    //var - changeable variable

    var name: String = "Hello Variables"
    println(name)

    println(topLevelVariables)
    println(greeting)

    greeting = "Hello,"
    println(greeting)

    println(notNullableVariable)
    println(nullableVariable)

    //Null can not be a value of a non-null type String
    //notNullableVariable = null
    nullableVariable = null

    println(nullableVariable)

}
