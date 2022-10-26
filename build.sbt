val scala3Version = "3.2.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "zio-example",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq("dev.zio" %% "zio" % "2.0.2")
  )
