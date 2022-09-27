package com.rafaebofflarissacarlos.riscocardiaco.intents

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.rafaebofflarissacarlos.riscocardiaco.R
import com.rafaebofflarissacarlos.riscocardiaco.databinding.ActivityGeneroBinding

class GeneroActivity : AppCompatActivity() {
    private lateinit var binding : ActivityGeneroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_genero)
        binding = ActivityGeneroBinding.inflate(layoutInflater)

        var resultado: Int = 0

        binding.button.setOnClickListener {
            var idRadio: Int = binding.radioGroupGenero.checkedRadioButtonId

            when(idRadio){
                R.id.radioButton1-> resultado = 1
                R.id.radioButton2-> resultado = 2
                R.id.radioButton3-> resultado = 3
                R.id.radioButton4-> resultado = 4
                R.id.radioButton5-> resultado = 6
                R.id.radioButton6-> resultado = 7
                else-> Toast.makeText(applicationContext, "É preciso selecionar uma opção.", Toast.LENGTH_LONG).show()
            }

            val proximaPagina = Intent(this, AtividadeActivity::class.java)
            startActivity(proximaPagina)

            val enviarDados = Intent(this, ColesterolActivity::class.java)
            enviarDados.putExtra("GeneroResultado", resultado)
            startActivity(proximaPagina)
        }
    }
}