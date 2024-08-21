package com.example.myrealimagesearch.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myrealimagesearch.presentation.search.SearchFragment
import com.example.myrealimagesearch.presentation.mypick.MyPickFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    private lateinit var viewpagerAdapter: ViewPagerAdapter

    private val fragmentList = listOf<Fragment>(SearchFragment(), MyPickFragment())

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }

}