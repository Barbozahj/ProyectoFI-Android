package com.curso.android.app.practica.proyectofinalintegrador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializar el ViewModel
        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        // Observar el resultado de la acción al presionar el botón
        viewModel.resultado.observe(this, Observer { resultado ->
            textViewResultado.text = resultado
        })

        // Configurar el OnClickListener del botón
        buttonComparar.setOnClickListener {
            val text1 = editTextTexto1.text.toString()
            val text2 = editTextTexto2.text.toString()
            viewModel.compararTextos(text1, text2)
        }
    }
}







