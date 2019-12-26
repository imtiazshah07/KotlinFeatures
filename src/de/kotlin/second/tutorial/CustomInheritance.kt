package de.kotlin.second.tutorial

//This type is final, so it cannot be inherited from
//(to resolve this add 'open' in front of BasicInfoProvider class

class FancyInfoProvider : BasicInfoProvider() {
    /**
     *
     */
    override val providerInfo: String
        get() = "FancyInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println(" Fancy Info Provider")
    }

    //to override a proper mark it as with open '    open val sessionIdPrefix = "Session"'

    override val sessionIdPrefix: String
        get() = "Fancy Session"
}

/**
 *
 */
fun main() {
    val provider = FancyInfoProvider()
    provider.printInfo(Person())

    provider.getSessionId()

}