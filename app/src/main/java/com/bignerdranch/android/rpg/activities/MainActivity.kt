package com.bignerdranch.android.rpg.activities

import android.os.Bundle
import com.bignerdranch.android.rpg.R
import com.bignerdranch.android.rpg.base.BaseActivity

class MainActivity : BaseActivity() {

    companion object {
        private val TAG = MainActivity::class.qualifiedName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}