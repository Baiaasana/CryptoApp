package com.example.crypto.ui.login

import androidx.fragment.app.viewModels
import com.example.crypto.databinding.FragmentLoginBinding
import com.example.crypto.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : BaseFragment<FragmentLoginBinding>(FragmentLoginBinding::inflate) {

    private val viewModel: LoginViewModel by viewModels()

    override fun listeners() {
    }

    override fun init() {
    }
}