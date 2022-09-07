package com.example.crypto.ui.reset_password

import androidx.fragment.app.viewModels
import com.example.crypto.databinding.FragmentResetPasswordBinding
import com.example.crypto.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ResetPasswordFragment : BaseFragment<FragmentResetPasswordBinding>(FragmentResetPasswordBinding::inflate) {

    private val viewModel: ResetPasswordViewModel by viewModels()

    override fun listeners() {
    }

    override fun init() {
    }
}