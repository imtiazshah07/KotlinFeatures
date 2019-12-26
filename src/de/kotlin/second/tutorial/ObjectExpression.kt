package de.kotlin.second.tutorial


fun main() {
    val provider = object : PersonInfoProvider {
        override val providerInfo: String
            get() = "This is new info provider"

        fun getSessionId() = "id"

    }
   // Expression 'providerInfo' of type 'String' cannot be invoked as a function. The function 'invoke()' is not found
   // provider.providerInfo(Person())

    println(provider.getSessionId())
}