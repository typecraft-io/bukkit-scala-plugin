ThisBuild / organization := "io.typecraft"

lazy val plugin = (project in file("plugin"))
  .settings(
    name := "bukkit-scala-plugin",
    version := "1.1.0",
    scalaVersion := "2.13.8",
    crossScalaVersions := Seq("2.13.8", "3.1.1"),
    resolvers ++= Seq(
      Resolver.mavenLocal
    ),
    libraryDependencies ++= Seq(
      "org.spigotmc" % "spigot-api" % "1.18.1-R0.1-SNAPSHOT" % "provided",
      "org.typelevel" %% "cats-core" % "2.7.0"
    )
  )
