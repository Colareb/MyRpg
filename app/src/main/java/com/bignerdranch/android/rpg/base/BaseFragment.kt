package com.bignerdranch.android.rpg.base

import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.bignerdranch.android.rpg.viewmodel.RpgViewModel

class BaseFragment : Fragment() {

    val rpgViewModel: RpgViewModel by activityViewModels()

}