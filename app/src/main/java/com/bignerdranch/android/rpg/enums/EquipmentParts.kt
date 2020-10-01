package com.bignerdranch.android.rpg.enums

enum class EquipmentParts(name: String) {
    CHEST("Chest"), GLOVES("Gloves"), HELMET("Helmet"), FIRSTWEAPON("First-weapon"), SECONDWEAPON("Second-weapon");

    override fun toString(): String {
        return name
    }
}