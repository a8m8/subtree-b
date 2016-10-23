organization := "com.github.a8m8"

name := "subtree-b"

version := "1.0"

scalaVersion := "2.11.8"

lazy val `subtree-b` = (project in file(".")).enablePlugins(PlayScala).disablePlugins(PlayLayoutPlugin)

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.1.3",
  specs2 % Test,
  "org.mockito" % "mockito-core" % "1.9.5" % "test"
)

PlayKeys.playMonitoredFiles ++= (sourceDirectories in(Compile, TwirlKeys.compileTemplates)).value

resolvers ++= Seq(
  "Local Maven Repository" at "file://" + Path.userHome.absolutePath + "/.m2/repository"
)

PlayKeys.devSettings += ("play.http.router", "subtreeb.Routes")
    