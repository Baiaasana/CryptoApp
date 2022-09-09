package com.example.crypto.ui.fragments.service_internet

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.crypto.R
import com.example.crypto.databinding.FragmentServiceInternetBinding
import com.example.crypto.ui.fragments.base.BaseFragment

class ServiceInternetFragment : BaseFragment<FragmentServiceInternetBinding>(FragmentServiceInternetBinding::inflate) {

    private val viewModel: ServiceInternetViewModel by viewModels()

    override fun listeners() {
    }

    override fun init() {
    }
}