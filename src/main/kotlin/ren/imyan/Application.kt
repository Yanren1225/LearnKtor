package ren.imyan

import io.ktor.client.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import ren.imyan.plugins.configureRouting
import ren.imyan.plugins.configureSerialization
import ren.imyan.plugins.configureTemplating

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureSerialization()
        configureHttpClient()
        configureRouting()
        configureTemplating()
    }.start(wait = true)
}

fun configureHttpClient() {
    HttpClient {
        install(JsonFeature) {
            serializer = KotlinxSerializer(kotlinx.serialization.json.Json {
                prettyPrint = true
                isLenient = true
            })
        }
    }
}