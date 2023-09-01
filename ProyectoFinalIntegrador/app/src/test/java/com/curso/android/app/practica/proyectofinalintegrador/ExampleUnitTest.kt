package com.curso.android.app.practica.proyectofinalintegrador

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MyViewModelTest {
        @Test
        fun testCompararTextos() {
            val viewModel = MyViewModel()

            // Caso de prueba 1: textos iguales
            viewModel.compararTextos("Hola", "Hola")
            assertEquals("Los textos son iguales", viewModel.resultado.value)

            // Caso de prueba 2: textos diferentes
            viewModel.compararTextos("Hola", "Adiós")
            assertEquals("Los textos son diferentes", viewModel.resultado.value)
        }
    }