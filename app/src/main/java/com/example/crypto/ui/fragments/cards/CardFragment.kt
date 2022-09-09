package com.example.crypto.ui.fragments.cards

import androidx.fragment.app.viewModels
import com.example.crypto.databinding.FragmentCardBinding
import com.example.crypto.ui.fragments.base.BaseFragment

class CardFragment : BaseFragment<FragmentCardBinding>(FragmentCardBinding::inflate) {

    private val viewModel: CardViewModel by viewModels()

    override fun listeners() {
    }

    override fun init() {
    }

}