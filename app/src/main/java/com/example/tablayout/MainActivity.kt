package com.example.tablayout

import ViewPagerAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayout=findViewById<TabLayout>(R.id.tablayout)
        val viewPager=findViewById<ViewPager>(R.id.framlayout)
        val adapter= ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(FirstFragment(),"Chats")
        adapter.addFragment(SecondFragment(),"Status")
        adapter.addFragment(ThirdFragment(),"Calls")


        viewPager.adapter=adapter
        tabLayout.setupWithViewPager(viewPager)
    }
}