package com.bignerdranch.android.rpg.models.creatures.superclass

import com.bignerdranch.android.rpg.models.Statistics
import com.bignerdranch.android.rpg.models.equipment.armor.superclass.Armor
import com.bignerdranch.android.rpg.models.equipment.weapons.superclass.Weapon

open class Creature(name: String) {

    val stats: Statistics = Statistics(0,0,0,0,0,0)
    val weapons: MutableList<Weapon> = ArrayList()
    val armor: MutableList<Armor> = ArrayList()

    val exp: Int = 1
    var level: Int = 1
    var hp: Int = 0
    var mp: Int = 0


}