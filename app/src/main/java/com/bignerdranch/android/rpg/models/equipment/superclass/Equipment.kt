package com.bignerdranch.android.rpg.models.equipment.superclass

import com.bignerdranch.android.rpg.application.MyApplication
import com.bignerdranch.android.rpg.enums.Elements

open class Equipment(nameId: Int, descriptionId: Int, val element: Elements) {

    val name: String =  MyApplication.getInstance().getString(nameId)
    val description: String = MyApplication.getInstance().getString(descriptionId)
}
