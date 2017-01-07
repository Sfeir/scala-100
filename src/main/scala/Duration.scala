/**
  * Sfeir School - Scala 100
  */
class Duration(val days: Int, val hours: Int) {
  // TODO: Check that hours is between 0 and 8

  val asHours: Int =
    days * 8 + hours

}
