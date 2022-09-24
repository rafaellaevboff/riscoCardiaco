package com.rafaebofflarissacarlos.riscocardiaco.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.rafaebofflarissacarlos.riscocardiaco.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val intent = Intent(applicationContext, IdadeActivity::class.java)

            startActivity(intent)
        }
    }
}