package siberia.utils.kodein

import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.auth.jwt.*
import io.ktor.server.routing.*
import org.kodein.di.DIAware
import org.kodein.di.instance

/**
 * A [KodeinAware] base class for Controllers handling routes.
 * It allows to easily get dependencies, and offers some useful extensions.
 */
@Suppress("KDocUnresolvedReference")
abstract class KodeinController : DIAware {
    /**
     * Injected dependency with the current [Application].
     */
    val application: Application by instance()

    /**
     * Method that subtypes must override to register the handled [Routing] routes.
     */
    abstract fun Routing.registerRoutes()

    fun getAuthorized(call: ApplicationCall) {
//        AuthorizedUser(
//            call.principal<JWTPrincipal>()?.getClaim("id", Int::class)!!,
//            call.principal<JWTPrincipal>()?.getClaim("login", String::class)!!,
//            call.principal<JWTPrincipal>()?.issuedAt?.time!!
//        )
    }
}