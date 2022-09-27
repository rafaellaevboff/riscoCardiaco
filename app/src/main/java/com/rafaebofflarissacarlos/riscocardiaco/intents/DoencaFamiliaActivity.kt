package com.rafaebofflarissacarlos.riscocardiaco.intents

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.rafaebofflarissacarlos.riscocardiaco.R
import com.rafaebofflarissacarlos.riscocardiaco.databinding.ActivityDoencafamiliaBinding

class DoencaFamiliaActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDoencafamiliaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDoencafamiliaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var resultado = 0
        val valores = this.intent.getIntegerArrayListExtra("ListaValores")

        binding.button.setOnClickListener {
            when(binding.radioGroupDoencaFamilia.checkedRadioButtonId){
                R.id.radioButton1-> resultado = 1
                R.id.radioButton2-> resultado = 2
                R.id.radioButton3-> resultado = 3
                R.id.radioButton4-> resultado = 4
                R.id.radioButton5-> resultado = 6
                R.id.radioButton6-> resultado = 7
                else-> Toast.makeText(applicationContext, "É preciso selecionar uma opção.", Toast.LENGTH_LONG).show()
            }
            valores!!.add(resultado)

            val proximaPagina = Intent(this, ColesterolActivity::class.java)
            proximaPagina.putIntegerArrayListExtra("ListaValores", valores)
            startActivity(proximaPagina)
        }
    }
}