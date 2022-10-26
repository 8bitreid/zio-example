package example.service

import zio.Console.printLine
import zio.{Task, ZIO}

class GreetingService {
  def sayHello: Task[Unit] =
    ZIO.logInfo(s"writing to console from ${this.getClass.getCanonicalName}") *> printLine("Hello, from GreetingService")

}
