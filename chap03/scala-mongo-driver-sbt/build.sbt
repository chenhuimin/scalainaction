name := "scala-mongo-driver"

scalaVersion := "2.10.6"

organization := "Scala in Action"

libraryDependencies += "org.mongodb" % "mongo-java-driver" % "2.10.1"

 
 // append options passed to the Scala compiler
scalacOptions ++= Seq("-deprecation", "-unchecked")