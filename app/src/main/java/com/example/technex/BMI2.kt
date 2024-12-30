package com.example.technex

import android.content.Intent
import android.os.Bundle
import android.os.Looper
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BMI2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bmi2)
        // Delay for 2 seconds and navigate to MainActivity
                    Handler(Looper.getMainLooper()).postDelayed({
                        val intent = Intent(this@BMI2, MainActivity::class.java)
                        startActivity(intent)
                        finish() // Close SplashActivity
                    }, 2000) // 2000ms = 2 seconds
                }
            }



