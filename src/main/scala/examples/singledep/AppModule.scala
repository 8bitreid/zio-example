package examples.singledep

import examples.singledep.service.GreetingService
import zio.{ULayer, ZLayer}

object AppModule {
  val greetingService: ULayer[GreetingService] =
    ZLayer.succeed(new GreetingService())
}
