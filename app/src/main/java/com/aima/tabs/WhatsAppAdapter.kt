package com.aima.tabs

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.aima.tabs.views.CallFragment
import com.aima.tabs.views.ChatFragment
import com.aima.tabs.views.StatusFragment

class WhatsAppAdapter(fm: FragmentManager): FragmentStatePagerAdapter(fm) {
    override fun getPageTitle(position: Int): CharSequence? {
      return when(position){
           0 -> "Chats"
           1 -> "Status"
           2 -> "Calls"
           else -> "Chats"
       }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
       when (position) {
           0 -> return ChatFragment()
           1 -> return StatusFragment()
           2 -> return CallFragment()
           else -> return ChatFragment()
       }
    }
}
