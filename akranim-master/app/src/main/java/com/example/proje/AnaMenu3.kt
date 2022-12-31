package com.example.proje

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.activity_takvim.*
import kotlinx.android.synthetic.main.fragment_ana_menu1.*
import kotlinx.android.synthetic.main.fragment_ana_menu1.geriButton
import kotlinx.android.synthetic.main.fragment_ana_menu1.locationButton
import kotlinx.android.synthetic.main.fragment_ana_menu1.profileButton
import kotlinx.android.synthetic.main.fragment_ana_menu2.*
import kotlinx.android.synthetic.main.fragment_ana_menu3.*
import kotlinx.android.synthetic.main.fragment_bilisimkulubu.*

class AnaMenu3 : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ana_menu3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        geriButton.setOnClickListener {
            val action=AnaMenu3Directions.actionAnaMenu3ToAnaMenu2()
            Navigation.findNavController(it).navigate(action)
        }

        locationButton.setOnClickListener {
            val action=AnaMenu3Directions.actionAnaMenu3ToYeditepeHarita()
            Navigation.findNavController(it).navigate(action)
        }

        anaEkran.setOnClickListener {
            val action=AnaMenu3Directions.actionAnaMenu3ToAnaMenu1()
            Navigation.findNavController(it).navigate(action)
        }

        profileButton.setOnClickListener {
            val action=AnaMenu3Directions.actionAnaMenu3ToProfileFragment()
            Navigation.findNavController(it).navigate(action)
        }

      anaEkran.setOnClickListener{
          val action= AnaMenu3Directions.actionAnaMenu3ToKulupTestinOlduguEkran()
          Navigation.findNavController(it).navigate(action)
      }









    }


}