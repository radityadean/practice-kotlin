package com.e.practiceplcoding.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.e.practiceplcoding.R
import com.e.practiceplcoding.ui.viewmodels.MainViewModel
import com.e.practiceplcoding.ui.viewmodels.StatiticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.fragment_statistics) {

    private val viewModel: StatiticsViewModel by viewModels()
}