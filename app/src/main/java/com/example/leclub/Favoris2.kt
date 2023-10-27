package com.example.leclub

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction

class Favoris2 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_favoris2, container, false)

        val bt1 = v.findViewById<Button>(R.id.viewprod)
        val bt2 = v.findViewById<Button>(R.id.viewprod2)

        bt1.setOnClickListener {
            val secondFragment = product()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.frame_layout, secondFragment)
            transaction.commit()
        }
        bt2.setOnClickListener {
            val secondFragment = product()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.frame_layout, secondFragment)
            transaction.commit()
        }
        return v
    }
}