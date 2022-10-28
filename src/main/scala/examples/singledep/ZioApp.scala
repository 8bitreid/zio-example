package examples.singledep

import examples.singledep.AppModule
import examples.singledep.service.GreetingService
import zio.{IO, Layer, Task, ULayer, ZIO, ZIOAppDefault, ZLayer}

object ZioApp extends ZIOAppDefault {
  def run: Task[Unit] =
    ZIO
      .serviceWithZIO[GreetingService](_.sayHello)
      .provideLayer(AppModule.greetingService)
}

