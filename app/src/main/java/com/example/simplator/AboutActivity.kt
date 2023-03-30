package com.example.simplator

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val button1: Button = findViewById(R.id.button_blog)
        button1.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://blog.squarezhong.com")
            startActivity(intent)
        }

        val button2: Button = findViewById(R.id.button_feedback)
        button2.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://github.com/squarezhong/Simple-Calculator/issues")
            startActivity(intent)
        }

        val button3: Button = findViewById(R.id.button_donation)
        button3.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://blog.squarezhong.com/#/Mess/donation")
            startActivity(intent)
        }
    }




}