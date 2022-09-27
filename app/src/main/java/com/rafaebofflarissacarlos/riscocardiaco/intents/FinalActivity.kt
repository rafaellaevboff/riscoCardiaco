package com.rafaebofflarissacarlos.riscocardiaco.intents

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.rafaebofflarissacarlos.riscocardiaco.databinding.ActivityFinalBinding

open class FinalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFinalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFinalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var valores = this.intent.getIntegerArrayListExtra("ListaValores")

        var riscoCardiaco: Int = calcularRiscoCardiaco(valores!!)
        println(riscoCardiaco)

        binding.resultadopontuacao.text = "$riscoCardiaco"

//        when(riscoCardiaco){
//        6..11-> binding.resultadorisco.text= "Sem risco"
//        12..17-> binding.resultadorisco.text= "Risco abaixo da média"
//        18..24-> binding.resultadorisco.text= "Risco Médio"
//        25..31-> binding.resultadorisco.text= "Risco Moderado"
//        32..40-> binding.resultadorisco.text= "Risco alto"
//        41..62-> binding.resultadorisco.text= "Risco muito alto"
//        else-> Toast.makeText(applicationContext, "Ops, a aplicação bugou :(.", Toast.LENGTH_LONG).show()
//        }

        binding.buttoninicio.setOnClickListener {
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }

        binding.buttonshare.setOnClickListener {
            val  sendIntent = Intent(Intent.ACTION_SEND)
            val texto = "Olá! Fiz meu teste de risco cardíaco. Meu resultado foi risco ${binding.resultadorisco.text}."
            sendIntent.putExtra(Intent.EXTRA_TEXT, texto)
            sendIntent.type = "text/plain"
            startActivity(sendIntent)
        }

    }

    open fun calcularRiscoCardiaco(valores:ArrayList<Int>) : Int {
        val iterator = valores.iterator()
        var soma : Int = 0
        while(iterator.hasNext()){
            soma += iterator.next()
        }
        return soma
    }
}