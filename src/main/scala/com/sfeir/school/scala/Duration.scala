package com.sfeir.school.scala

/**
  * Sfeir School - Scala 100
  */

object Duration {

  def fromHours(hours: Int): Duration =
    new Duration(hours / 8, hours % 8)

}

class Duration(val days: Int = 0, val hours: Int = 0) {
  require(hours >= 0 && hours <= 7, "Hours must be between 0 and 7")

  val asHours: Int =
    days * 8 + hours

  def plus(that: Duration): Int =
    this.asHours + that.asHours

  def +(that: Duration): Int =
    plus(that)

}
