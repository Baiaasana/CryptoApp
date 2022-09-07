package com.example.crypto.ui.forgot_password

import androidx.fragment.app.viewModels
import com.example.crypto.databinding.FragmentForgotPasswordBinding
import com.example.crypto.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ForgotPasswordFragment : BaseFragment<FragmentForgotPasswordBinding>(FragmentForgotPasswordBinding::inflate) {

    private val viewModel: ForgotPasswordViewModel by viewModels()

    override fun listeners() {
    }

    override fun init() {
    }
}