package com.codecriticon.kotlin.big_nerd_ranch_book.nyethack.model

fun main() {
    var swordsJuggling: Int? = null
    val isJugglingProficent = (1..3).shuffled().last() == 3
    if (isJugglingProficent) {
        swordsJuggling = 2
    }

try {
    proficiencyCheck(swordsJuggling)
    swordsJuggling = swordsJuggling!!.plus(1)
}catch (e: Exception) {
    println()
}
    println("You juggle $swordsJuggling swords!")
}

fun proficiencyCheck(swordsJuggling: Int?) {
    checkNotNull(swordsJuggling, { "Player cannot juggle swords" })
}

class UnskilledSwordJugglerException(): IllegalStateException("Player cannot juggle swords")
