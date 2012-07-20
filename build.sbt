name := "sbt_test"

version := "1.0"

scalaVersion := "2.9.1"

libraryDependencies += "org.specs2" %% "specs2" % "1.6.1"

libraryDependencies += "org.specs2" %% "specs2-scalaz-core" % "6.0.1" % "test"

libraryDependencies += "org.mockito" % "mockito-all" % "1.9.0" % "test"

resolvers += "snapshots" at "http://scala-tools.org/repo-snapshots"

resolvers += "releases"  at "http://scala-tools.org/repo-releases"
