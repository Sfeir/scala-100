package com.sfeir.school.scala

/**
  * Sfeir School - Scala 100
  */
case class Training(topic: String, level: Int, planning: Seq[Location]) {
  require(planning.nonEmpty, "planning must contains at least one element")
}


case class Location(name: String)