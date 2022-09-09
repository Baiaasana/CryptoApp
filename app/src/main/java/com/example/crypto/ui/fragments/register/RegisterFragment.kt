package com.example.crypto.ui.fragments.register

import androidx.fragment.app.viewModels
import com.example.crypto.databinding.FragmentRegisterBinding
import com.example.crypto.ui.fragments.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

class RegisterFragment : BaseFragment<FragmentRegisterBinding>(FragmentRegisterBinding::inflate) {

    private val viewModel: RegisterViewModel by viewModels()

    override fun listeners() {
    }

    override fun init() {
    }

}