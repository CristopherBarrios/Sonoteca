package com.miempresa.personal.fonoteca.kotlin

import   com.github.kittinunf.fuel.Fuel
import kotlin.concurrent.thread
import org.jetbrains.exposed.sql.Database
import com.miempresa.personal.fonoteca.kotlin.dbmodels.Song
import com.miempresa.personal.fonoteca.kotlin.models.song


fun main(args: Array<String>) {
    val url = "https://next.json-generator.com/api/json/get/EkeSgmXycS"

    val (request, response, result) = Fuel.get(url).responseObject(song.songArrayDeserializer())
    val (persons, err) = result
    persons?.forEach { println(it) }

    Database.connect(
            "jdbc:postgresql:misctests",
            "org.postgresql.Driver",
            "postgres",
            "postgres"
    )