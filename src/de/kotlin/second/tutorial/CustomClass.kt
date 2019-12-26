package de.kotlin.second.tutorial

// Class with primary constructor
class CustomClass(_firstName: String, _lastName: String) {
    val firstName: String = _firstName
    val lastName: String = _lastName

    //Init block (class can have multiple init box)
    /*
    init {
        firstName = _firstName
        lastName = _lastName
    }
    */

}

// Class with constructor
//class CustomClass constructor() or

//class CustomClass() or

//class CustomClass(val firstName: String, val lastName: String)

class WithSecondaryConstructor(val firstName: String, val lastName: String) {

    //Init box will be executed before constructor
    init {
        println(" First Init Block")
    }

    constructor() : this("defaultFirstName", "defaultLastName") {
        println("Secondary Constructor")
    }

    init {
        println(" Second Init Block")
    }
}

// Class with properties
class PrimaryConstructorWithDefaultValues(
    val firstName: String = "defaultFristName",
    val lastName: String = "defaultLastName"
) {

    var nickName: String? = null
        set(value) {
            field = value

            println("the new nick name is $value")
        }
        get() {
            println("the return field is $field")
            return field
        }


}

/**
 *
 */
//Class with method
class ClassWithMethod(
    val firstName: String = "defaultFristName",
    val lastName: String = "defaultLastName"
) {
    var nickName: String? = null

    fun printInfo() {
        // Elvis Operator
        var validateNickName = nickName ?: "no nick name"
        //OR var validateNickName = if(nickName != null) nickName else "no nick name"

        println("$firstName and $lastName ($validateNickName)")
    }
}

//Visibility modifier
// public - by default
// internal - public with in the module
// private - only available in the file (class), in method (variable)
// protected - property / method only be availble in class, method / sub classes

/**
 *
 */
fun main() {

    var customClass = CustomClass(_firstName = "MyFirstName", _lastName = "MyLastName")

    //Property access syntex
    println(customClass.firstName)
    println(customClass.lastName)

    println("***************************")

    var sConstructor = WithSecondaryConstructor();
    println(sConstructor.firstName)
    println(sConstructor.lastName)

    println("***************************")

    var primaryConstructor = PrimaryConstructorWithDefaultValues()
    println(primaryConstructor.firstName)
    println(primaryConstructor.lastName)

    primaryConstructor.nickName = "MyNickName"
    primaryConstructor.nickName = "NewMyNickName"

    println(primaryConstructor.nickName)

    println("***************************")


    var classWithMethod = ClassWithMethod()
    classWithMethod.printInfo()
}