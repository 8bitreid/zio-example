package example.service

import zio.{ULayer, ZLayer}

object AppModule {
  val greetingService: ULayer[GreetingService] =
    ZLayer.succeed(new GreetingService())
}
