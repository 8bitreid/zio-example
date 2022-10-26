package example

import zio.{IO, Layer, Task, ULayer, ZIO, ZIOAppDefault, ZLayer}
import example.service.{AppModule, GreetingService}

object ZioApp extends ZIOAppDefault {
  def run: Task[Unit] =
    ZIO
      .serviceWithZIO[GreetingService](_.sayHello)
      .provideLayer(AppModule.greetingService)
}

