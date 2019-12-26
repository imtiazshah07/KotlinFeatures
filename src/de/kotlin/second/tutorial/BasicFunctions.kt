package de.kotlin.second.tutorial

/**
 *
 */
fun funWithVoidReturnTypeAndNoParameter(): Unit {
}

/**
 *
 */
fun funWithStringReturnTypeAndNoParameter(): String {
    return "Hello, Return Value"
}

/**
 *
 */
fun funWithStringReturnTypeAndStringParam(text: String): String {
    //return "Hello, "+text
    return "Hello, $text" //reduced boilerplates
}

fun singleLineFunWithSingleParameter(text: String) = println(" Hello, $text")

fun singleLIneFunWithTwoParameter(paramOne: String, paramTwo: String) = println("$paramOne $paramTwo")

/**
 *
 */
fun sayHello() {
    println(funWithStringReturnTypeAndNoParameter())
}

/**
 *
 */
fun funExpectNullAsReturnValue(): String? {
    return null
}

/**
 *
 */
fun funSingleExpression(): String = "Single Expression Function"

fun funSingleExpressionOr() = "Single Expression Function"


/**
 *
 */
fun main() {
    println(funWithVoidReturnTypeAndNoParameter())

    println(funWithStringReturnTypeAndNoParameter())

    println(sayHello())
}

