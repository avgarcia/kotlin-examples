package com.codecriticon.kotlin.big_nerd_ranch_book.nyethack

import com.codecriticon.kotlin.big_nerd_ranch_book.nyethack.model.Player

fun main() {
    val player = Player("Madrigal")
    player.castFireball()

    printPlayerStatus(player)
}

private fun printPlayerStatus(player: Player) {
    println("(Aura: ${player.auraColor()}) (Blessed: ${if (player.isBlessed) "YES" else "NO"})")
    println("${player.name} ${player.formatHealthStatus()}")
}
