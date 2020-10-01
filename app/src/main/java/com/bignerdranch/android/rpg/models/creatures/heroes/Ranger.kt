package com.bignerdranch.android.rpg.models.creatures.heroes

import com.bignerdranch.android.rpg.enums.EquipmentParts
import com.bignerdranch.android.rpg.models.equipment.armor.helmets.LeatherHelmet
import com.bignerdranch.android.rpg.models.equipment.weapons.melee.ElvishDoubleSwords
import com.bignerdranch.android.rpg.models.creatures.heroes.superclass.Hero
import com.bignerdranch.android.rpg.models.equipment.armor.superclass.Armor
import com.bignerdranch.android.rpg.models.equipment.weapons.superclass.Weapon

class Ranger(name: String) : Hero(name) {

    init {

        val rangerWeapons: MutableList<Weapon> = ArrayList()
        val rangerArmor: MutableList<Armor> = ArrayList()

        val equipment: MutableMap<EquipmentParts, Weapon>

        rangerWeapons.add(ElvishDoubleSwords())
        rangerArmor.add(LeatherHelmet())

        //Max stat at 5 min stat at 1. Sum of stats at level one == 12
        levelOne(3,1,5,0, 1, 2, rangerWeapons, rangerArmor)
    }

    fun levelUp() {
        //Sum of stats at levelUp == 6
        super.levelUp(2,0,2,0,1,1)
    }
}