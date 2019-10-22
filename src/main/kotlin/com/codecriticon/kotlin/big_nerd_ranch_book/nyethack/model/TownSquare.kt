package com.codecriticon.kotlin.big_nerd_ranch_book.nyethack.model

open class TownSquare : Room("Town Square") {
    override val dangerLevel = super.dangerLevel - 3

    private var bellSound = "GWOG"

    final override fun load() = "The villagers rally and cheer as you enter!"

    private fun ringBell() = "The bell tower announces your arrival. $bellSound"

}