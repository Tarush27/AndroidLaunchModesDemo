package com.tarush27.alm

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val btnOpenThirdActivity: AppCompatButton = findViewById(R.id.btnThree)
        val btnReOpenThirdActivity: AppCompatButton = findViewById(R.id.btnReopen)
        btnOpenThirdActivity.setOnClickListener {
            startActivity(Intent(this, ThirdActivity::class.java))
        }

        btnReOpenThirdActivity.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }

    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Toast.makeText(this, "onNewIntent for 2nd Act", Toast.LENGTH_SHORT).show()
    }
}