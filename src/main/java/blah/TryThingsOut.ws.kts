import reactor.core.publisher.Flux
import java.util.*

val elements = listOf<Int>()

Flux.just(1, 2, 3, 4)
        .log()

//assertThat(elements).containsExactly(1, 2, 3, 4);