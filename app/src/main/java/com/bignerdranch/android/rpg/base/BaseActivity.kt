package com.bignerdranch.android.rpg.base

import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.bignerdranch.android.rpg.viewmodel.RpgViewModel

open class BaseActivity : AppCompatActivity(){

    val rpgViewModel: RpgViewModel by viewModels()

}