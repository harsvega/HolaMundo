package com.example.holamundo.activities

import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import com.example.holamundo.R
import com.example.holamundo.other.LifeCycleEventsActivity

class LifeCycleActivity : LifeCycleEventsActivity() {

    private var exitEnabled = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
    }

    override fun onBackPressed() {
        if (exitEnabled) {
            super.onBackPressed()
        }
        exitEnabled = true
        Toast.makeText(this, "Click back again to exit this screen", Toast.LENGTH_SHORT).show()


    }
}