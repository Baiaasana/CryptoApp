package com.example.crypto.ui.fragments.crypto

import com.example.crypto.databinding.FragmentCryptoBinding
import com.example.crypto.ui.fragments.base.BaseFragment

class CryptoFragment : BaseFragment<FragmentCryptoBinding>(FragmentCryptoBinding::inflate) {

    private lateinit var viewModel: CryptoViewModel

    override fun listeners() {
    }

    override fun init() {
    }
}