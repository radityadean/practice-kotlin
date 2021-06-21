package com.e.practiceplcoding.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.e.practiceplcoding.R
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_profile.*

@AndroidEntryPoint
class ProfileFragment : Fragment(R.layout.fragment_profile) {

    override fun  onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnApplyChanges.setOnClickListener {
            Snackbar.make(view, "Ini sedang tahap pengetesan", Snackbar.LENGTH_SHORT).show()
        }

    }


}