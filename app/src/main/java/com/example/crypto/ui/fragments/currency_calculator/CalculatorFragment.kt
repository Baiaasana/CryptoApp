package com.example.crypto.ui.fragments.currency_calculator

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.crypto.R
import com.example.crypto.databinding.FragmentCalculatorBinding
import com.example.crypto.ui.fragments.base.BaseFragment

class CalculatorFragment : BaseFragment<FragmentCalculatorBinding>(FragmentCalculatorBinding::inflate) {

    private val viewModel: CalculatorViewModel by viewModels()

    override fun listeners() {
    }

    override fun init() {
    }
}