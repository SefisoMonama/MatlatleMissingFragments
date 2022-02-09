package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment() {

    private lateinit var binding: FragmentSettingsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSettingsBinding.inflate(layoutInflater)
        setupUi()
        return binding.root
    }

    fun setupUi(){

        //when toolbar back button pressed navigate back to home screen
        binding.settingToolbar.setNavigationIcon(R.drawable.ic_back)
        binding.settingToolbar.setNavigationOnClickListener{

        }

        //when traditional android back button pressed navigate back to home screen
        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                //findNavController().navigate(R.id.homeScreenFragment)
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(callback)
    }
}