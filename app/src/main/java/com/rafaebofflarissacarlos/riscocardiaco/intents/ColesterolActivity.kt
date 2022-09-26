package com.rafaebofflarissacarlos.riscocardiaco.intents

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.rafaebofflarissacarlos.riscocardiaco.R

class ColesterolActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_colesterol)

        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val intent = Intent(applicationContext, FinalActivity::class.java)

            startActivity(intent)
        }
    }
}