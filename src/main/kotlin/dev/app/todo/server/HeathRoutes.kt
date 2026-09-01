package dev.app.todo.server;

import io.ktor.http.HttpStatusCode
import io.ktor.server.response.respondText
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.route
import io.ktor.server.response.respond

object HeathService {
    var ready = false;
}

fun Route.heathRoutes() {
    route("/heath") {
        get("/ready"){
            call.respondText("HELLO: Welcome to the server!", status = HttpStatusCode.OK)
        }

        get("/live"){
            call.respond(HttpStatusCode.OK)
        }
    }
}