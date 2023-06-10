package com.tarush27.alm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        val btnOpenSecondActivity: AppCompatButton = findViewById(R.id.btnTwo)
        val btnReOpenThirdActivity: AppCompatButton = findViewById(R.id.btnReopen)
        btnOpenSecondActivity.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }

        btnReOpenThirdActivity.setOnClickListener {
            startActivity(Intent(this, ThirdActivity::class.java))
        }
    }
}