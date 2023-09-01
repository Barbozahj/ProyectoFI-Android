package com.curso.android.app.practica.proyectofinalintegrador
import androidx.Lifecycle.LiveData
import androidx.Lifecycle.MutableLiveData
import androidx.Lifecycle.viewModelScope
import com.curso.android.app.practica.comprador.proyectofinalintegradormodel.Comparador
import java.util.Date

class MyViewModel : ViewModel() {
        private val _resultado = MutableLiveData<String>()
        val resultado: LiveData<String> get() = _resultado

        fun compararTextos(text1: String, text2: String) {
            // Realizar la lógica de comparación de textos aquí
            val resultado = if (text1 == text2) {
                "Los textos son iguales"
            } else {
                "Los textos son diferentes"
            }
            _resultado.value = resultado
        }
    }
