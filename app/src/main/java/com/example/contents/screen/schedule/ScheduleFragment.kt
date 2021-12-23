package com.example.contents.screen.schedule

import com.example.contents.R
import com.example.contents.databinding.FragmentOnlyListBinding
import com.example.contents.screen.BaseFragment

internal class ScheduleFragment: BaseFragment<FragmentOnlyListBinding>() {
    override fun getViewBinding(): FragmentOnlyListBinding {
        return FragmentOnlyListBinding.inflate(layoutInflater)
    }

    override fun initViews() {
        binding.txtLayoutName.text = "스케쥴"
    }
}