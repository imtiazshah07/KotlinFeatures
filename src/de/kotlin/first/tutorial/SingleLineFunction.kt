package de.kotlin.first.tutorial

fun main(args:Array<String>){
    // Single line function (not required return type usually.
    fun add(numberOne: Int, numberTwo: Int): Int = numberOne + numberTwo

    fun sub(numberOne: Int, numberTwo: Int): Int = numberOne - numberTwo

    println(" 5 - 4 = ${sub(5, 4)}")

    println(" 5 - 4 = ${sub(numberOne = 5, numberTwo = 4)}")

    fun sayHello(name: String): Unit = println(" Hello, $name")

    sayHello("ToMe")

    val (two, three) = nextTwo(1)

    println(" Two: $two $three")


    println("GetSum : ${getSum(1, 2, 3, 4, 5)}")

    val multipuly = { numberOne: Int, numberTwo: Int -> numberOne * numberTwo }

    println(" 5 * 3 = ${multipuly(5, 3)}")

    println(" 5! = ${factorial(5)}")

}


fun nextTwo(number: Int): Pair<Int, Int> {
    return Pair(number + 1, number + 2)
}


fun getSum(vararg numsum: Int): Int {
    var sum = 0

    numsum.forEach { n -> sum += n }

    return sum
}



fun factorial(x: Int): Int {
    tailrec fun factTail(y: Int, z: Int): Int {
        if (y == 0) return z
        else
            return factTail(y - 1, y * z)

    }
    return factTail(x, 1)
}