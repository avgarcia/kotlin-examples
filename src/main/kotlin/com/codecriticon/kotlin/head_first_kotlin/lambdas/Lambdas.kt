package com.codecriticon.kotlin.head_first_kotlin.lambdas

typealias DoubleConversion = (Double) -> Double

fun main() {
    val addFive = { x: Int -> x + 5 }
    println("Pass 6 to addFive: ${addFive(6)}")

    val addInts = { x: Int, y: Int -> x + y }
    val result = addInts.invoke(6, 7)
    println("Pass 6, 7 to addInts: $result")

    val intLambda: (Int, Int) -> Int = { x, y -> x * y }
    println("Pass 10, 11 to intLambda: ${intLambda(10, 11)}")

    val addSeven: (Int) -> Int = { it + 7 }
    println("Pass 12 to addSeven: ${addSeven(12)}")

    val myLambda: () -> Unit = { println("Hi!") }
    myLambda()

    convert(20.0) {
        it * 1.8 + 32
    }

    convertFive {
        it * 1.8 + 32
    }

    val punds = getConversionLambda("KgsToPounds")(2.5)

    convert(20.0, getConversionLambda("CentigradeToFahrenheit"))

    val kgsToPounds = { x: Double -> x * 2.204623 }
    val poundsToUSTons = { x: Double -> x / 2000.0 }

    val kgToUSTons = combine(kgsToPounds, poundsToUSTons)

    val usTons = kgToUSTons(1000.0)

}

fun convert(x: Double, converter: DoubleConversion): Double {
    val result = converter(x)
    println("$x si converted to $result")

    return result
}

fun convertFive(converter: (Int) -> Double): Double {
    val result = converter(5)
    println("5 is converted to $result")

    return result
}

fun getConversionLambda(str: String): DoubleConversion {
    when (str) {
        "CentigradeToFahrenheit" -> return { it * 1.8 + 32 }
        "KgsToPounds" -> return { it * 2.204623 }
        "PoundsToUSTons" -> return { it / 2000.0 }
        else -> return { it }
    }
}

fun combine(lambda1: DoubleConversion, lambda2: DoubleConversion): DoubleConversion {
    return { x: Double -> lambda2(lambda1(x)) }
}