package com.rafaebofflarissacarlos.riscocardiaco.intents

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.rafaebofflarissacarlos.riscocardiaco.R
import com.rafaebofflarissacarlos.riscocardiaco.databinding.ActivityIdadeBinding

class IdadeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityIdadeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_idade)
        binding = ActivityIdadeBinding.inflate(layoutInflater)

        var valores = ArrayList<Int>()
        var resultado: Int = 0

        binding.button.setOnClickListener {
            var idRadio: Int = binding.radioGroupIdade.checkedRadioButtonId

            when(idRadio){
                R.id.radioButton1-> resultado = 0
                R.id.radioButton2-> resultado = 1
                R.id.radioButton3-> resultado = 2
                R.id.radioButton4-> resultado = 4
                R.id.radioButton5-> resultado = 6
                R.id.radioButton6-> resultado = 10
                else-> Toast.makeText(applicationContext, "É preciso selecionar uma opção.", Toast.LENGTH_LONG).show()
            }
            valores.add(resultado)

            val proximaPagina = Intent(this, PressaoActivity::class.java)
            proximaPagina.putIntegerArrayListExtra("ListaValores", valores)
            startActivity(proximaPagina)
        }
    }
}
