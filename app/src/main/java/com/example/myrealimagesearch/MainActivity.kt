package com.example.myrealimagesearch

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.myrealimagesearch.Adapter.ViewPagerAdapter
import com.example.myrealimagesearch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initViewPager()
        initBottomNavi()
    }

    // 뷰페이저 어댑터 연결
    private fun initViewPager() {
        val viewPager = binding.mainViewpager
        val viewPagerAdapter = ViewPagerAdapter(this)

        viewPager.adapter = viewPagerAdapter

        // 뷰페이저 넘기기 -> bottomnavigation도 활성화
        viewPager.registerOnPageChangeCallback(
            object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    binding.bottomNavibar.menu.getItem(position).isChecked = true
                }
            })
    }

    //Bottomnavegation 설정
    private fun initBottomNavi() {
        binding.bottomNavibar.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.search_result -> {
                    binding.mainViewpager.currentItem = 0
                    return@setOnItemSelectedListener true
                }

                else -> {
                    binding.mainViewpager.currentItem = 1
                    return@setOnItemSelectedListener true
                }
            }
        }
    }
}