package com.bignerdranch.android.rpg.enums

enum class Elements(name: String) {

    NORMAL("Normal"), FIRE("Fire"),  WATER("Water"), ICE("Ice"), THUNDER("Thunder"), WIND("Wind");

    override fun toString(): String {
        return name
    }
}