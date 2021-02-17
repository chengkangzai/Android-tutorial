package com.example.t1_diceroller

class Dice(private val numberSides: Int) {
    fun roll(): Int {
        val numberSides = numberSides;
        return (1..numberSides).random()
    }
}