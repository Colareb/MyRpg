package com.bignerdranch.android.rpg.models.equipment.weapons.superclass

import com.bignerdranch.android.rpg.enums.Elements
import com.bignerdranch.android.rpg.enums.EquipmentParts
import com.bignerdranch.android.rpg.enums.TypeAttack
import com.bignerdranch.android.rpg.models.equipment.superclass.Equipment

open class Weapon(nameId: Int, descriptionId: Int, element: Elements, equipmentPart: EquipmentParts, val attackDamage: Int, val typeAttack: TypeAttack, val isTwoHandWeapon: Boolean): Equipment(nameId, descriptionId, element, equipmentPart) {
}