package com.codecriticon.kotlin.head_first_kotlin.classes.inheritance

class Vet {

    fun giveShot(animal: Animal) {
        animal.makeNoise()
    }

}

fun main() {
    val animals = arrayOf(Hippo(), Wolf())

    for (animal in animals) {
        animal.roam()
        animal.eat()
    }

    val vet = Vet()
    for (animal in animals) {
        vet.giveShot(animal)
    }

}
