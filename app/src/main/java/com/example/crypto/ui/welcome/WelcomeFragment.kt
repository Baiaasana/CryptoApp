package com.example.crypto.ui.welcome

import androidx.fragment.app.viewModels
import com.example.crypto.databinding.FragmentWelcomeBinding
import com.example.crypto.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WelcomeFragment : BaseFragment<FragmentWelcomeBinding>(FragmentWelcomeBinding::inflate) {

    private val viewModel: WelcomeViewModel by viewModels()

    override fun listeners() {
    }

    override fun init() {
    }
}