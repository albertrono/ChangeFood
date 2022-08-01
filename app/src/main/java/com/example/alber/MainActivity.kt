package com.example.alber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var buttonsubmit: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonsubmit = findViewById(R.id.btn_submit)
        buttonsubmit!!.setOnClickListener {
            val intent = Intent(this, activity_food::class.java)
            startActivity(intent)
        }
    }
}
