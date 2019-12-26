package de.kotlin.first.tutorial

fun main(args:Array<String>){
    //Higher Order Functions

    val numberList = 1..20

    val evenList = numberList.filter { it % 2 == 0 }
    evenList.forEach { n -> println(n)}

    val multi3 = makeMathFunc(3)

    println(" 5 * 3 = ${multi3(3)}")

    val multiply2 = {num1: Int -> num1 * 2}
    val numList = arrayOf(1,2,3,4,5,6,7)

    mathonList(numList, multiply2)

    println(" Evens: ${numList.any{ it % 2 ==0}}")
    println(" Evens: ${numList.all{ it % 2 ==0}}")

}



fun mathonList(numberOneList: Array<Int>, myFunc:(num: Int) -> Int)
{
    for(num in numberOneList){
        println(" MathonList  ${myFunc(num)}")
    }
}




//call function return dynamically created funtion
fun makeMathFunc(numberOne: Int): (Int) -> Int = {numberTwo -> numberOne * numberTwo}

