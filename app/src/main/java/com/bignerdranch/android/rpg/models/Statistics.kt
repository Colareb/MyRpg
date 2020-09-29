package com.bignerdranch.android.rpg.models

data class Statistics(var constitution: Int, var strength: Int, var dexterity: Int, var intelligence: Int, var defense: Int, var elusion: Int) {

    override fun toString(): String {
        return "Contistution: $constitution, Strength: $strength, Dexterity: $dexterity, Intelligence: $intelligence, Defense: $defense, Elusion: $elusion"
    }
}