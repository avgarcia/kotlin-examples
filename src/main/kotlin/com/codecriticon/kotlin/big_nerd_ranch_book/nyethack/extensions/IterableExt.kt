package com.codecriticon.kotlin.big_nerd_ranch_book.nyethack.extensions

fun <T> Iterable<T>.random(): T = this.shuffled().first()