package com.sfeir.school.scala

/**
  * Sfeir School - Scala 100
  */
class Duration(val days: Int = 0, val hours: Int = 0) {
  // TODO: Check that hours is between 0 and 8

  val asHours: Int =
    days * 8 + hours

  def plus(that: Duration): Int =
    this.asHours + that.asHours

  def +(that: Duration): Int =
    plus(that)

}
