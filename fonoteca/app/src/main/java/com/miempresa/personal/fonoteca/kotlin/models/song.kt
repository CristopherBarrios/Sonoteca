package com.miempresa.personal.fonoteca.kotlin.models

import com.github.kittinunf.fuel.core.ResponseDeserializable
import com.google.gson.Gson

data class song(val year: Int, val country: String){
    class songArrayDeserializer: ResponseDeserializable<Array<song>> {
        override fun deserialize(content: String): Array<song>? {
            return Gson().fromJson(content, Array<song>::class.java)
    }
}
}