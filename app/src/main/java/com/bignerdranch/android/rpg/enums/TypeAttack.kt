package com.bignerdranch.android.rpg.enums

enum class TypeAttack(name: String) {

    SLASHING("Slashing"), PIERCING("Piercing"), BLUDGEONING("Bludgeoning");

    override fun toString(): String {
        return name
    }
}