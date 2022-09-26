package com.rafaebofflarissacarlos.riscocardiaco.intents

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.rafaebofflarissacarlos.riscocardiaco.R

class AtividadeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_atividade)

        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val intent = Intent(applicationContext, FumanteActivity::class.java)

            startActivity(intent)
        }
    }
}