package com.rafaebofflarissacarlos.riscocardiaco.intents

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.rafaebofflarissacarlos.riscocardiaco.databinding.ActivityFinalBinding

open class FinalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFinalBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFinalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val valores = this.intent.getIntegerArrayListExtra("ListaValores")

        val riscoCardiaco: Int = calcularRiscoCardiaco(valores!!)

        binding.textoPontuacao.text = "Sua pontuação foi: $riscoCardiaco"

        when(riscoCardiaco){
        in 6..11-> binding.risco.text= "@string/semrisco"
        in 12..17-> binding.risco.text= "@string/abaixomedia"
        in 18..24-> binding.risco.text= "@string/medio"
        in 25..31-> binding.risco.text= "Moderado"
        in 32..40-> binding.risco.text= "Alto"
        in 41..62-> binding.risco.text= "Muito alto"
        else-> Toast.makeText(applicationContext, "Ops, a aplicação bugou :(.", Toast.LENGTH_LONG).show()
        }

        binding.buttoninicio.setOnClickListener {
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }

        binding.buttonshare.setOnClickListener {
            val  sendIntent = Intent(Intent.ACTION_SEND)
            val texto = "Olá! Fiz meu teste de risco cardíaco. Meu resultado foi ${binding.risco.text}."
            sendIntent.putExtra(Intent.EXTRA_TEXT, texto)
            sendIntent.type = "text/plain"
            startActivity(sendIntent)
        }

    }

    open fun calcularRiscoCardiaco(valores:ArrayList<Int>) : Int {
        val iterator = valores.iterator()
        var soma = 0
        while(iterator.hasNext()){
            soma += iterator.next()
        }
        return soma
    }
}