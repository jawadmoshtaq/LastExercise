package com.example.develhopelastexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private val homeFrag = HomeFrag()
    private val settingFragment = SettingFragment()
    private val infoFragment = InfoFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(HomeFrag())


        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNav.setOnItemSelectedListener {
            when (it.itemId){
                R.id.ic_home_frag -> replaceFragment(homeFrag)
                R.id.ic_setting_frag -> replaceFragment(settingFragment)
                R.id.ic_info_frag -> replaceFragment(infoFragment)
            }
            true
        }


    }
    private fun replaceFragment(homeFrag: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,homeFrag)
        fragmentTransaction.commit()
    }


}