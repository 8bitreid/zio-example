package example.service

import zio.Console.printLine
import zio.{Task, ZIO}

class GreetingService {
  def sayHello: Task[Unit] =
    ZIO.logInfo(s"writing to console") *> printLine("Hello, from GreetingService")

}
