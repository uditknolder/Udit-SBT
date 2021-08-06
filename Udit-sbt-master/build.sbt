name := "Sbt-Assignment"

version := "1.4.4"

scalaVersion := "2.12.12"

lazy val http = (project in file("http"))
  .settings(
    name := "http",
    libraryDependencies ++= Seq("com.typesafe.akka" %% "akka-http" % "10.2.5",
      "com.typesafe.akka" %% "akka-stream" % "2.6.15",
      "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test,
      "com.typesafe.akka" %% "akka-http-testkit" % "10.2.5" % Test,
      "com.typesafe.akka" %% "akka-stream-testkit" % "2.6.15" % Test,
      "com.typesafe.akka" %% "akka-testkit" % "2.6.15" % Test,
      "org.mockito" %% "mockito-scala" % "1.16.37" % Test


    )
  )

lazy val act = (project in file("Actor"))
  .settings(
    name := "Actor",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-persistence-typed" % "2.6.15",
      "com.typesafe.akka" %% "akka-actor" % "2.6.15",
      "com.typesafe.akka" %% "akka-testkit" % "2.6.15" % Test,
      "com.typesafe.akka" %% "akka-persistence-testkit" % "2.6.15" % Test


    )
  )

lazy val root = (project in file(".")).aggregate(act, http)
