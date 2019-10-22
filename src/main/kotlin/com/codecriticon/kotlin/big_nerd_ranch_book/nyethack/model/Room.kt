package com.codecriticon.kotlin.big_nerd_ranch_book.nyethack.model

open class Room(val name: String) {
    protected open val dangerLevel = 5

    fun description() = "Room: $name Danger level: $dangerLevel"

    open fun load() = "Nothing much to see here..."

}
