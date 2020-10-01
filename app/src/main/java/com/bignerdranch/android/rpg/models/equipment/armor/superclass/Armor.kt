package com.bignerdranch.android.rpg.models.equipment.armor.superclass

import com.bignerdranch.android.rpg.enums.Elements
import com.bignerdranch.android.rpg.enums.EquipmentParts
import com.bignerdranch.android.rpg.models.equipment.superclass.Equipment

open class Armor(nameId: Int, descriptionId: Int, element: Elements, equipmentPart: EquipmentParts, val defense: Int): Equipment(nameId, descriptionId, element, equipmentPart) {

}