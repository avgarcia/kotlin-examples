package com.codecriticon.kotlin.big_nerd_ranch_book.nyethack.model

import com.codecriticon.kotlin.big_nerd_ranch_book.nyethack.extensions.random as randomizer
import java.io.File

class Player(
    _name: String,
    override var healthPoints: Int = 100,
    val isBlessed: Boolean,
    private val isInmortal: Boolean
) : Fightable {

    override val diceCount: Int = 3
    override val diceSides: Int = 6

    val homeTown  by lazy { selectHometown() }

    var currentPosition = Coordinate(0, 0)

    val name = _name
        get() = "${field.capitalize()} of $homeTown"

    constructor(name: String) : this(name, isBlessed = true, isInmortal = false) {
        if (name.toLowerCase() == "kar")
            healthPoints = 40
    }

    init {
        require(healthPoints > 0) { "healthPoints must be greater than zero." }
        require(name.isNotBlank()) { "Player must have a name." }
    }

    override fun attack(oponent: Fightable): Int {
        val damageDealt = if (isBlessed) {
            damageRoll * 2
        } else {
            damageRoll
        }

        oponent.healthPoints-= damageDealt
        return damageDealt
    }

    fun castFireball(numFireballs: Int = 2) =
        println("A glass of Fireball springs into existence. (x$numFireballs)")

    fun auraColor(): String {
        val auraVisible = isBlessed && healthPoints > 50 || isInmortal
        return if (auraVisible) "GREEN" else "NONE"
    }

    fun formatHealthStatus(): String = when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> {
            if (isBlessed)
                "has some minor wounds but is healing quite quickly!"
            else
                "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }

    private fun selectHometown() = File("data/towns.txt")
        .readText()
        .split("\n")
        .randomizer()

}
