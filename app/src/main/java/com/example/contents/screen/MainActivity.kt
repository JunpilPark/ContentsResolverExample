package com.example.contents.screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.example.contents.R
import com.example.contents.screen.viewpager.MainPagerAdapter
import com.example.contents.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        mainBinding.vpMain.apply {
            adapter = MainPagerAdapter(context as FragmentActivity)
        }

        val tabNameIds = intArrayOf(R.string.tab_menu_contact, R.string.tab_menu_schedule)
        TabLayoutMediator(mainBinding.tabMain, mainBinding.vpMain)
        { tab, position ->
            run {
                tab.text = getString(tabNameIds[position])
            }
        }.attach()
    }
}