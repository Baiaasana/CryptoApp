package com.example.crypto.ui.fragments.edit_profile

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.crypto.R
import com.example.crypto.databinding.FragmentEditProfileBinding
import com.example.crypto.ui.fragments.base.BaseFragment

class EditProfileFragment : BaseFragment<FragmentEditProfileBinding>(FragmentEditProfileBinding::inflate) {

    private lateinit var viewModel: EditProfileViewModel

    override fun listeners() {
    }

    override fun init() {
    }
}