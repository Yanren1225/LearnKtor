package ren.imyan

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import ren.imyan.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureTemplating()
    }.start(wait = true)
}
