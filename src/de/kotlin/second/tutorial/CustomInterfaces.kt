package de.kotlin.second.tutorial


class Person(
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

// Here interface can provide default implementation
interface PersonInfoProvider {
    // Method decleration
    // fun printInfo(person: Person)

    //method default implementation
    fun printInfo(person: Person) {
        println(providerInfo)
        person.printInfo()
    }

    val providerInfo: String

}

/**
 *
 */
interface SessionInfoProvider {
    fun getSessionId(): String
}

/**
 *
 */
// can be abstract
open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
    // if override removed : 'printInfo' hides member of supertype 'PersonInfoProvider' and needs 'override' modifier
    override fun printInfo(person: Person) {
        //call the super implementation if required
        super.printInfo(person)

        println("In printInfo method of BasicInfoProvider")
        person.printInfo()
    }

    /**
     *
     */
    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun getSessionId(): String {
        println("In Session Id of BasicInfoProvider")
        return sessionIdPrefix
    }

    protected open val sessionIdPrefix = "Session"
}

fun checkTypes(infoProvider: PersonInfoProvider) {

    //if (infoProvider is SessionInfoProvider){

    if (infoProvider !is SessionInfoProvider) {
        println("Session Info Provider")
    } else {
        println("Not a session info provider")
        println((infoProvider as SessionInfoProvider).getSessionId())
        //Smart Cast
        println(infoProvider.getSessionId())

    }
}

/**
 *
 */
fun main() {
    var basicInfoObject = BasicInfoProvider()
    basicInfoObject.printInfo(Person())
    println(basicInfoObject.getSessionId())

    checkTypes(basicInfoObject)
}