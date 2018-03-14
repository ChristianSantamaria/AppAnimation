package com.example.christian.appanimation

import android.util.Log


data class Mensajes constructor(private var key2: String = "Hi"){

    var key: String = ""
        // get por defecto
        get() = field
        // cambiamos el set
        set(value) {
            field = value + " :P"
        }

    companion object Compi {
        fun say(message: String) {
            Log.d("Mensajes",message)
        }
    }

}