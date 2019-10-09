package com.codecriticon.kotlin.head_first_kotlin.classes.data

class Mushroom(
    val size: Int,
    val isMagic: Boolean
) {
    constructor(isMagic_param: Boolean): this(0, isMagic_param)
}