package com.e.practiceplcoding.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.e.practiceplcoding.R
import com.e.practiceplcoding.db.RunDAO
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var runDAO: RunDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("runDao", "RUNDAO: ${runDAO.hashCode()}")


        val myArray = arrayOf("hello", "guys", "whats up?")
        println(myArray[0])
    }

}
