package com.codecriticon.kotlin.head_first_kotlin.classes.inheritance

open class Animal(
    open val image: String = "",
    open val food: String = "",
    open val habitat: String = "",
    val hunger: Int = 10
) {
    open fun makeNoise() {
        println("The Animal is making a noise")
    }

    open fun eat() {
        println("The Animal is eating")
    }

    open fun roam() {
        println("The Animal is roaming")
    }

    fun sleep() {
        println("The Animal is sleeping")
    }

}
