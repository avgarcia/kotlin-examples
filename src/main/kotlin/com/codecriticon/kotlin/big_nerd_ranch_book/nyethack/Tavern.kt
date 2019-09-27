package com.codecriticon.kotlin.big_nerd_ranch_book.nyethack

fun main() {
    var beverage = readLine()?.let {
        if (it.isNotBlank()) it.capitalize() else "Buttered Ale"
    }

    println(beverage)
}
