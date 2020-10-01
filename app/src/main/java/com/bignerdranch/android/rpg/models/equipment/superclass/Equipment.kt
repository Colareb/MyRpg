package com.bignerdranch.android.rpg.models.equipment.superclass

import com.bignerdranch.android.rpg.application.MyApplication
import com.bignerdranch.android.rpg.enums.Elements
import com.bignerdranch.android.rpg.enums.EquipmentParts

open class Equipment(nameId: Int, descriptionId: Int, val element: Elements, val equipmentPart: EquipmentParts) {

    val name: String =  MyApplication.getInstance().getString(nameId)
    val description: String = MyApplication.getInstance().getString(descriptionId)
}
