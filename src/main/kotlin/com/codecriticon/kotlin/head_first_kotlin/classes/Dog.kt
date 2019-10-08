package com.codecriticon.kotlin.head_first_kotlin.classes

class Dog (
    val name: String,
    var weigth: Int,
    val breed: String
) {
    var activities = arrayOf("Walks")
    val weightInKgs: Double
        get() = weigth / 2.2

    init {
        println("Dog $name has been created.")
    }

    fun bark() {
        println(if (weigth < 20) "Yip!" else "Woof!")
    }
}