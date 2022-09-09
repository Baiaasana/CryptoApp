package com.example.crypto.ui.fragments.history

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.crypto.R
import com.example.crypto.databinding.FragmentHistoryBinding
import com.example.crypto.ui.fragments.base.BaseFragment

class HistoryFragment : BaseFragment<FragmentHistoryBinding>(FragmentHistoryBinding::inflate) {

    private val viewModel: HistoryViewModel by viewModels()

    override fun listeners() {
    }

    override fun init() {
    }
}