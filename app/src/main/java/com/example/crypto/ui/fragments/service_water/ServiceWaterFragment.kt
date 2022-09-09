package com.example.crypto.ui.fragments.service_water

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.crypto.R
import com.example.crypto.databinding.FragmentServiceWaterBinding
import com.example.crypto.ui.fragments.base.BaseFragment

class ServiceWaterFragment : BaseFragment<FragmentServiceWaterBinding>(FragmentServiceWaterBinding::inflate) {

    private val viewModel: ServiceWaterViewModel by viewModels()

    override fun listeners() {
    }

    override fun init() {
    }
}