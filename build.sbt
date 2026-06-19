name := "example-sbt"

version := "1.0"

scalaVersion := "2.12.15"

libraryDependencies += "org.mindrot" % "jbcrypt" % "0.3m"

libraryDependencies += "net.liftweb" % "lift-webkit_2.12" % "3.2.0-M3"

libraryDependencies += "com.typesafe.play" % "play_2.12" % "2.6.7"

// log4j 1.2.17: multiple critical CVEs (CVE-2019-17571, CVE-2020-9493)
libraryDependencies += "log4j" % "log4j" % "1.2.17"

// commons-collections 3.2.1: deserialization RCE (CVE-2015-6420)
libraryDependencies += "commons-collections" % "commons-collections" % "3.2.1"

// commons-codec for encoding utilities
libraryDependencies += "commons-codec" % "commons-codec" % "1.11"

// jackson-databind for JSON processing
libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.9.10"

// spring-core: CVE-2022-22965 (Spring4Shell)
libraryDependencies += "org.springframework" % "spring-core" % "5.3.16"

libraryDependencies += "org.scalatestplus.play" % "scalatestplus-play_2.12" % "3.1.2" % Test

libraryDependencies += "org.mockito" % "mockito-core" % "4.11.0" % Test
