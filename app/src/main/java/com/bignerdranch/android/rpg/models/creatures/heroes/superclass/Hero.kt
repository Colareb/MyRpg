package com.bignerdranch.android.rpg.models.creatures.heroes.superclass

import com.bignerdranch.android.rpg.models.creatures.superclass.Creature
import com.bignerdranch.android.rpg.models.equipment.armor.superclass.Armor
import com.bignerdranch.android.rpg.models.equipment.weapons.superclass.Weapon

abstract class Hero(val name: String): Creature(name) {

    fun levelOne(constitution: Int, strength: Int, dexterity: Int, intelligence: Int, defense: Int, elusion: Int, weapons: List<Weapon>, armor: List<Armor>) {
        stats.constitution = constitution
        stats.strength = strength
        stats.dexterity = dexterity
        stats.intelligence = intelligence
        stats.defense = defense
        stats.elusion = elusion

        hp = constitution * 5
        mp = intelligence * 3

        this.weapons.addAll(weapons)
        this.armor.addAll(armor)

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

        return "My name is $name, i have ${weapons[0].name} plus ${armor[0].name} and my stats are:\n ${stats.toString()}"
    }
}