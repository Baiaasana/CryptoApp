package com.example.crypto.ui.profile

import androidx.fragment.app.viewModels
import com.example.crypto.databinding.FragmentProfileBinding
import com.example.crypto.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProfileFragment : BaseFragment<FragmentProfileBinding>(FragmentProfileBinding::inflate) {

    private val viewModel: ProfileViewModel by viewModels()

    override fun listeners() {
    }

    override fun init() {
    }
}