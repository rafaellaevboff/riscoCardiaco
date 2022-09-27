package com.rafaebofflarissacarlos.riscocardiaco.intents

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.rafaebofflarissacarlos.riscocardiaco.R

class IdadeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_idade)

        var unidade = findViewById<EditText>(R.id.editTextNumber)

        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val intent = Intent(applicationContext, GeneroActivity::class.java)

            startActivity(intent)
        }
    }
}