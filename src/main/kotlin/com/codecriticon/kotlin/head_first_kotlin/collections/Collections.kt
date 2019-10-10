package com.codecriticon.kotlin.head_first_kotlin.collections

data class Recipe(var name: String)

fun main() {
    var mShoppingList = mutableListOf("Tea", "Eggs", "Milk")
    println("mShoppingList original: $mShoppingList")

    val extraShopping = listOf("Cookies", "Sugar", "Eggs")
    mShoppingList.addAll(extraShopping)
    println("mShoppingList items added: $mShoppingList")

    if (mShoppingList.contains("Tea")) {
        mShoppingList[mShoppingList.indexOf("Tear")] = "Coffee"
    }

    mShoppingList.sort()
    println("mShoppingList sorted: $mShoppingList")

    mShoppingList.reverse()
    println("mShoppingList reversed: $mShoppingList")

    val mShoppingSet = mShoppingList.toMutableSet()
    println("mShoppingSet: $mShoppingSet")

    val moreShopping = setOf("Chieves", "Spinach", "Milk")
    mShoppingSet.addAll(moreShopping)
    println("mShopingSet items added: $mShoppingSet")

    mShoppingList = mShoppingSet.toMutableList()
    println("mShoppingList new version: $mShoppingList")

    val r1 = Recipe("Chicken Soup")
    val r2 = Recipe("Quinoa Salad")
    val r3 = Recipe("Thai Curry")
    val r4 = Recipe("Jambalaya")
    val r5 = Recipe("Sausage Rolls")
    val mRecipeMap = mutableMapOf("Recipe 1" to r1, "Recipe 2" to r2, "Recipe 3 " to r3)
    println("mRecipeMap original: $mRecipeMap")

    val recipeToAdd = mapOf("Recipe 4" to r4, "Recipe 5 " to r5)
    mRecipeMap.putAll(recipeToAdd)
    println("mRecipeMao updated; $mRecipeMap")
    if (!mRecipeMap.containsKey("Recipe 1"))
        return println("Recipe 1 is : ·${mRecipeMap.getValue("Recipe 1")}")

}