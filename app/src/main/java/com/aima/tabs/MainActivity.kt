package com.aima.tabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aima.tabs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var whatsAppAdapter: WhatsAppAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        whatsAppAdapter = WhatsAppAdapter(supportFragmentManager)
        binding.pager.adapter = whatsAppAdapter
        binding.tabLayout.setupWithViewPager(binding.pager)
    }
}