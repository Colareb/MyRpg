package com.bignerdranch.android.rpg.application

import android.app.Application

class MyApplication: Application() {

    companion object {

        private lateinit var instance: MyApplication
        fun getInstance() = instance
    }

    init {
        instance = this
    }
}