
import io.ktor.application.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*

fun Application.main(testing: Boolean = false) {
    routing {
        post("/test") {
            log.info("Before receive text")
            val text = call.receiveText()
            log.info("After receive text")
            call.respondText("raw text: '$text'")
        }
    }
}