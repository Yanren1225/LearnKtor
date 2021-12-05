package ren.imyan.plugins

import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.application.*
import io.ktor.client.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.features.*
import io.ktor.http.content.*
import io.ktor.response.*
import io.ktor.request.*
import kotlinx.serialization.json.Json

fun Application.configureRouting() {

    routing {
        get("/") {
            call.respond(mapOf("123" to false))
        }
        static("/homepage") {
            resources("homepage/index.html")
        }
    }
}
