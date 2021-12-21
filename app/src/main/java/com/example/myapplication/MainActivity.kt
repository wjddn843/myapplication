package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, HomeFragment()).commit()//첫 화면 초기화

        binding.bottomNavigation.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.home -> {
                    val homeFragment = HomeFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, homeFragment).commit()
                }
                R.id.trading -> {
                    val tradingFragment = TradingFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, tradingFragment).commit()
                }
                R.id.reward -> {
                val rewardFragment = RewardFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, rewardFragment).commit()
            }
                R.id.setting -> {
                    val settingFragment = SettingFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, settingFragment).commit()
                }
            }
            true
        }
    }
}