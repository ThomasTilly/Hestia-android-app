package com.example.leclub

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.FragmentManager

class product : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_product, container, false)
        val goback = view.findViewById<Button>(R.id.button5)

        goback.setOnClickListener {
            // Utilisez le FragmentManager pour revenir au fragment précédent
            parentFragmentManager.popBackStack()
        }
        return view
    }
}