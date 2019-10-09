package com.codecriticon.kotlin.head_first_kotlin.classes.inheritance

abstract class Animal : Roamable {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    val hunger: Int = 10

    abstract fun makeNoise()

    abstract fun eat()

    override fun roam() {
        println("The Animal is roaming")
    }

    fun sleep() {
        println("The Animal is sleeping")
    }

}
