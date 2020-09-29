package com.bignerdranch.android.rpg.models.heroes

import com.bignerdranch.android.rpg.models.equipment.armor.helmets.LeatherHelmet
import com.bignerdranch.android.rpg.models.equipment.weapons.melee.ElvishDoubleSwords
import com.bignerdranch.android.rpg.models.equipment.superclass.Equipment
import com.bignerdranch.android.rpg.models.heroes.superclass.Hero

class Ranger(name: String) : Hero(name) {

    init {

        val rangerEquipment: ArrayList<Equipment> = ArrayList()

        rangerEquipment.add(ElvishDoubleSwords())
        rangerEquipment.add(LeatherHelmet())

        //Max stat at 5 min stat at 1. Sum of stats at level one == 12
        levelOne(3,1,5,0, 1, 2, rangerEquipment)
    }

    fun levelUp() {
        //Sum of stats at levelUp == 6
        super.levelUp(2,0,2,0,1,1)
    }
}