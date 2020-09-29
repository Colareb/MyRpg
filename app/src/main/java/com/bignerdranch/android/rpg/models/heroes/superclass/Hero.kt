package com.bignerdranch.android.rpg.models.heroes.superclass

import com.bignerdranch.android.rpg.models.Statistics
import com.bignerdranch.android.rpg.models.equipment.superclass.Equipment

abstract class Hero(val name: String) {

    val stats: Statistics = Statistics(0,0,0,0,0,0)
    val equipment: ArrayList<Equipment> = ArrayList()

    var level: Int = 1
    var hp: Int = 0
    var mp: Int = 0

    fun levelOne(constitution: Int, strength: Int, dexterity: Int, intelligence: Int, defense: Int, elusion: Int, equipment: ArrayList<Equipment>) {
        stats.constitution = constitution
        stats.strength = strength
        stats.dexterity = dexterity
        stats.intelligence = intelligence
        stats.defense = defense
        stats.elusion = elusion

        hp = constitution * 5
        mp = intelligence * 3

        this.equipment.addAll(equipment)
    }

    fun levelUp( constitution: Int, strength: Int, dexterity: Int, intelligence: Int, defense: Int, elusion: Int) {

        stats.constitution += constitution
        stats.strength += strength
        stats.dexterity += dexterity
        stats.intelligence += intelligence
        stats.defense += defense
        stats.elusion += elusion

        level += 1
        hp = stats.constitution * 5
        mp = stats.intelligence * 3
    }

    override fun toString(): String {

        return "My name is $name, i have ${equipment[0].name} plus ${equipment[1].name} and my stats are:\n ${stats.toString()}"
    }
}