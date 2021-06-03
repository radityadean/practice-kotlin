package com.e.practiceplcoding.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.e.practiceplcoding.R
import com.e.practiceplcoding.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
    
@AndroidEntryPoint
class RunFragment : Fragment(R.layout.fragment_run) {

    private val viewModel: MainViewModel by viewModels()
}