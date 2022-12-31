package com.example.proje

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_ana_menu1.*


class AnaMenu1 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ana_menu1, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ileriButton.setOnClickListener {
            val action=AnaMenu1Directions.actionAnaMenu1ToAnaMenu2()
            Navigation.findNavController(it).navigate(action)
        }

        locationButton.setOnClickListener {
            val action=AnaMenu1Directions.actionAnaMenu1ToYeditepeHarita()
            Navigation.findNavController(it).navigate(action)
        }

        profileButton.setOnClickListener {
            val action=AnaMenu1Directions.actionAnaMenu1ToProfileFragment()
            Navigation.findNavController(it).navigate(action)
        }

        takvimButton.setOnClickListener {
            val action=AnaMenu1Directions.actionAnaMenu1ToTakvim()
            Navigation.findNavController(it).navigate(action)
        }

        butonkulup1.setOnClickListener {
            val action=AnaMenu1Directions.actionAnaMenu1ToKulupTestinOlduguEkran()
            Navigation.findNavController(it).navigate(action)
        }

    }

}