package com.example.crypto.ui.register

import androidx.fragment.app.viewModels
import com.example.crypto.databinding.FragmentRegisterBinding
import com.example.crypto.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegisterFragment : BaseFragment<FragmentRegisterBinding>(FragmentRegisterBinding::inflate) {

    private val viewModel: RegisterViewModel by viewModels()

    override fun listeners() {
    }

    override fun init() {
    }

}