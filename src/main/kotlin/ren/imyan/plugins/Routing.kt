package ren.imyan.plugins

import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.application.*
import io.ktor.client.features.json.*
import io.ktor.http.content.*
import io.ktor.response.*
import io.ktor.request.*

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
