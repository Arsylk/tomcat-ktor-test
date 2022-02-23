import io.ktor.application.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*

fun Application.main() {
    routing {
        post("/method") {
            val text = call.receiveText()
            call.respondText("post text: '$text'")
        }
    }
}