package com.rafaebofflarissacarlos.riscocardiaco.intents

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.rafaebofflarissacarlos.riscocardiaco.R

class DoencaFamiliaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doencafamilia)

        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val intent = Intent(applicationContext, ColesterolActivity::class.java)

            startActivity(intent)
        }
    }
}