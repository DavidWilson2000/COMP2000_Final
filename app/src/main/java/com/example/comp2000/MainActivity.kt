package com.example.comp2000

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.comp2000.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set the content view to load the activity_home.xml layout
        setContentView(R.layout.activity_leave_request)
    }
}

