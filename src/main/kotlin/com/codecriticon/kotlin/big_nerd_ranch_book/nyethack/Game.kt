package com.codecriticon.kotlin.big_nerd_ranch_book.nyethack

fun main() {
    val name = "Madrigal"
    val healthPoints = 100
    val isBlessed = true
    val isInmortal = true

    val auraColor = auraColor(isBlessed = isBlessed, healthPoints = healthPoints, isInmortal = isInmortal)

    val healthStatus = formatHealthStatus(healthPoints = healthPoints, isBlessed = isBlessed)

    printPlayerStatus(auraColor = auraColor, isBlessed = isBlessed, name = name, healthStatus = healthStatus)

    castFireball()
}

private fun printPlayerStatus(
    auraColor: String,
    isBlessed: Boolean,
    name: String,
    healthStatus: String
) {
    println("(Aura: $auraColor) (Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")
}

private fun auraColor(isBlessed: Boolean, healthPoints: Int, isInmortal: Boolean): String {
    val auraVisible = isBlessed && healthPoints > 50 || isInmortal
    return if (auraVisible) "GREEN" else "NONE"
}

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean): String = when (healthPoints) {
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

private fun castFireball(numFireballs: Int = 2) =
    println("A glass of Fireball springs into existence. (x$numFireballs)")