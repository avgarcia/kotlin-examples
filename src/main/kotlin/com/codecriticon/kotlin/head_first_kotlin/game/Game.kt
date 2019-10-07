package com.codecriticon.kotlin.head_first_kotlin.game

fun main() {
    val gameOptions = arrayOf("Rock", "Paper", "Scissor")
    val gameChoice = getGameChoice(gameOptions)
    val userChoice = getUserChoice(gameOptions)

    println("Computer: $gameChoice -> User: $userChoice")
    println(printResult(gameChoice, userChoice))
}

fun getGameChoice(options: Array<String>) = options[(Math.random() * options.size).toInt()]

fun getUserChoice(options: Array<String>): String {
    println("Please enter one of the following: ${options.joinToString()}")
    var userOption = readLine()
    while (userOption !in options) {
        println("Your selection isn't right. Please select on of this: ${options.joinToString()}")
        userOption = readLine()
    }

    return userOption!!
}

fun printResult(gameChoice: String, userChoice: String): String {
    return if (userChoice == gameChoice) "Tie!"
    else if ((userChoice == "Rock" && gameChoice == "Scissors") || (userChoice == "Paper" && gameChoice == "Rock") ||
        (userChoice == "Scissors" && gameChoice == "Paper")
    ) "You win!"
    else "You lose!"
}
