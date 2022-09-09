package com.example.crypto.ui.fragments.services

import androidx.fragment.app.viewModels
import com.example.crypto.databinding.FragmentServicesBinding
import com.example.crypto.ui.fragments.base.BaseFragment

class ServicesFragment : BaseFragment<FragmentServicesBinding>(FragmentServicesBinding::inflate) {

    private val viewModel: ServicesViewModel by viewModels()

    override fun listeners() {
    }

    override fun init() {
    }
}