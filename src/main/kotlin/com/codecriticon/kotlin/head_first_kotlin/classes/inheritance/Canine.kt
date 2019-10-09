package com.codecriticon.kotlin.head_first_kotlin.classes.inheritance

abstract class Canine : Animal() {

    override fun roam() {
        println("The Canine is roaming")
    }
}