package com.example.crypto.ui.splash_screen

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.crypto.R
import com.example.crypto.databinding.FragmentSplashScreenBinding
import com.example.crypto.ui.base.BaseFragment

class SplashScreenFragment : BaseFragment<FragmentSplashScreenBinding>(FragmentSplashScreenBinding::inflate) {

    private val viewModel: SplashScreenViewModel by viewModels()

    override fun listeners() {
    }

    override fun init() {
    }
}