package com.rafaebofflarissacarlos.riscocardiaco.intents

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.rafaebofflarissacarlos.riscocardiaco.R

class FinalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        var buttoninicio = findViewById<Button>(R.id.buttoninicio)
        buttoninicio.setOnClickListener{
            val intent = Intent(applicationContext, MainActivity::class.java)

            startActivity(intent)
        }

        var resultadoPessoa : String = ""

        var buttonshare = findViewById<Button>(R.id.buttonshare)
        buttonshare.setOnClickListener{
            val  sendIntent = Intent(Intent.ACTION_SEND)
            val texto = "Olá! Fiz meu teste de risco cardíaco. Meu resultado foi $resultadoPessoa"
            sendIntent.putExtra(Intent.EXTRA_TEXT, texto)
            sendIntent.type = "text/plain"
            startActivity(sendIntent)
        }
    }
}