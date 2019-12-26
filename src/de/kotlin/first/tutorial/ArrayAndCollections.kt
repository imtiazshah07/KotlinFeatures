package de.kotlin.first.tutorial

fun main(args:Array<String>){


    // Arrays
    var myArray = arrayOf(1, 1.3, "Me")
    println(myArray[2])
    myArray[1] = 33.3

    println(" My Array Length : ${myArray.size}")
    println(" Me in Array : ${myArray.contains("me")}")

    var partOfArray = myArray.copyOfRange(0, 2);

    println("First : ${myArray.first()}")
    println(" Me Index :${myArray.indexOf("Me")} ")


    // CollectionssqArray

    var sqArray = Array(5, { x -> x * 5 })
    println("Sqr of 3 is $sqArray[3]")

    var arrayTwo: Array<Int> = arrayOf(1, 2, 3, 4, 5)


    //Collection operators
    val numberListTwo = 1..20

    val listSum = numberListTwo.reduce { x,y -> x+y}
    println("Reduced Sum: $listSum")

    val listFold = numberListTwo.fold(5) { x,y -> x+y}
    println("Fold Sum: $listFold")

    val big3 = numberListTwo.filter {  it > 3 }

    big3.forEach{ n-> println(">3 : $n")}


    //Map
    val timesSeven = numberListTwo.map{ it * 7}
    timesSeven.forEach{ n-> println(" *7 : $n")}

    //Collection List
    // Mutibule List
    var listOneMutable: MutableList<Int> = mutableListOf(1,2,3,4,5)

    //Immutable List
    val listOneImmutable: List<Int> = listOf(1,2,3,4,5,6)


    listOneMutable.add(10)

    println("${listOneMutable.first()}")
    println("${listOneMutable.last()}")

    println("${listOneMutable[2]}")

    var listThree = listOneMutable.subList(3,6)

    println("Length: ${listOneMutable.size}")

    listOneMutable.clear()

    // listOneMutable.remove(1)

    //listOneMutable.removeAt(0)

    //   listOneMutable[0] = 10

    listOneMutable.forEach { n -> println(" Mutable List : $n")}



    // Map<Key,Value>

    val mapMutable = mutableMapOf<Int, Any?>()

    val mapMutableTwo = mutableMapOf(1 to "ABC", 2 to 25)

    mapMutable[1] = "XYZ"
    mapMutable[2] = 42

    println("Map Size: ${mapMutable.size}")

    mapMutable.put(3, "Its new value")

    mapMutable.remove(2)

    for((x,y) in mapMutable){
        println(" Key: $x Value: $y")
    }
}
