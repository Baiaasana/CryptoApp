package com.example.crypto.ui.home

import androidx.fragment.app.viewModels
import com.example.crypto.databinding.FragmentHomeBinding
import com.example.crypto.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    private val viewModel: HomeViewModel by viewModels()

    override fun listeners() {
    }

    override fun init() {
    }
}