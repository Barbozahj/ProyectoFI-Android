package com.curso.android.app.practica.proyectofinalintegrador

import androidx.room.jarjarred.org.antlr.v4.tool.Rule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)


class MainActivityTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)
    @Test
    fun testClickCompararButton() {
        // Ingresar texto en los cuadros de texto
        onView(withId(R.id.editTextTexto0)).perform(typeText("Hola"))
        onView(withId(R.id.editTextTexto1)).perform(typeText("Hola"))

        // Hacer clic en el botón Comparar
        onView(withId(R.id.buttonComparar)).perform(click())

        // Verificar que el resultado se muestre correctamente en el TextView
        onView(withId(R.id.textViewResultado)).check(matches(withText("Los textos son iguales")))
    }
}