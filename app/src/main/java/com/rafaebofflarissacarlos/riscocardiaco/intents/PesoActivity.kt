package com.rafaebofflarissacarlos.riscocardiaco.intents

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.rafaebofflarissacarlos.riscocardiaco.R
import com.rafaebofflarissacarlos.riscocardiaco.databinding.ActivityPesoBinding

class PesoActivity : AppCompatActivity() {
    private lateinit var binding : ActivityPesoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_peso)
        binding = ActivityPesoBinding.inflate(layoutInflater)

        binding.button.setOnClickListener {
            var idRadio: Int = binding.radioGroupPeso.checkedRadioButtonId

        }
    }
}