package com.example.contents.screen.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.contents.screen.contact.ContactFragment
import com.example.contents.screen.schedule.ScheduleFragment

class MainPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> ContactFragment()
            1 -> ScheduleFragment()
            else -> ContactFragment()
        }
    }

}