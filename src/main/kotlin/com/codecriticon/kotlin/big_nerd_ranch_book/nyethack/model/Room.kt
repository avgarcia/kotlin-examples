package com.codecriticon.kotlin.big_nerd_ranch_book.nyethack.model

open class Room(val name: String) {
    protected open val dangerLevel = 5
    var monster: Monster? = Goblin()

    fun description() = "Room: $name Danger level: $dangerLevel Creature: ${monster?.description ?: "none"}"

    open fun load() = "Nothing much to see here..."

}
