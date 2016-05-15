//import sbt._
//import Keys._
//
//object ExampleBuild extends Build {
//  val hello = TaskKey[Unit]("hello", "Prints 'Hello World'")
//
//  val helloTask = hello := {
//    println("Hello World")
//  }
//
//  lazy val project = Project (
//    "project",
//    file (".")) settings(helloTask)
//}

import sbt._
import Keys._

object ExampleBuild extends Build {
  val hello = TaskKey[Unit]("hello","Prints Hello World")
  val helloTask: Setting[Task[Unit]] = hello := {
    println("Hello World")
  }
  val project = Project(
    "example",
    file(".")).settings(helloTask)
}