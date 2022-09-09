package com.example.crypto.ui.fragments.service_electricity

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.crypto.R
import com.example.crypto.databinding.FragmentServiceElectricityBinding
import com.example.crypto.ui.fragments.base.BaseFragment

class ServiceElectricityFragment : BaseFragment<FragmentServiceElectricityBinding>(FragmentServiceElectricityBinding::inflate) {

    private val viewModel: ServiceElectricityViewModel by viewModels()

    override fun listeners() {
    }

    override fun init() {
    }
}