package com.e.practiceplcoding.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.e.practiceplcoding.repositories.MainRepository

class StatiticsViewModel @ViewModelInject constructor(
    val mainRepository: MainRepository
): ViewModel() {
}