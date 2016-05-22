organization := "com.sfeir.school"

name := "scala-100"

version := "1.0.0"

scalaVersion := "2.11.8"

scalacOptions ++= List(
  "-unchecked",
  "-deprecation",
  "-language:_",
  "-target:jvm-1.8",
  "-encoding", "UTF-8"
)

initialCommands in console := "import com.sfeir.school.scala._"