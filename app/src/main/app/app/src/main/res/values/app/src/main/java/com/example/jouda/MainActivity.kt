package com.example.jouda

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // For demo: go directly to Home (no login yet)
        startActivity(Intent(this, HomeActivity::class.java))
        finish()
    }
}
