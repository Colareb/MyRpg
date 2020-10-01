package com.bignerdranch.android.rpg.models.equipment.weapons.melee

import com.bignerdranch.android.rpg.R
import com.bignerdranch.android.rpg.enums.Elements
import com.bignerdranch.android.rpg.enums.EquipmentParts
import com.bignerdranch.android.rpg.enums.TypeAttack
import com.bignerdranch.android.rpg.models.equipment.weapons.superclass.Weapon

class ElvishDoubleSwords: Weapon(R.string.elvish_swords_name, R.string.elvish_swords_description, Elements.NORMAL, EquipmentParts.FIRSTWEAPON, 40, TypeAttack.SLASHING, true) {

    // Someone says Legolas?
}