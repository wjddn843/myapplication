package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        good_bye_icon.setColorFilter(Color.parseColor("#D63200"))
        file_icon.setColorFilter(Color.parseColor("#D63200"))
        user_icon.setColorFilter(Color.parseColor("#C4C6C8"))

        val manager = childFragmentManager
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.fragment,FragmentHomeCard())
        transaction.replace(R.id.fragment2,FragmentHomeAssets())
        transaction.addToBackStack(null)
        transaction.commit()

        cardbtn.setOnClickListener {
            childFragmentManager.beginTransaction()
                .replace(R.id.fragment,FragmentHomeCard())
                .commit()
        }
        cardbtn2.setOnClickListener {
            childFragmentManager.beginTransaction()
                .replace(R.id.fragment,FragmentHomeCard2())
                .commit()
        }
        cardbtn3.setOnClickListener {
            childFragmentManager.beginTransaction()
                .replace(R.id.fragment,FragmentHomeCard3())
                .commit()
        }
    }
}