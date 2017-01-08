package com.sfeir.school.scala

/**
  * Sfeir School - Scala 100
  */
case class SfeirSchool(trainings: Set[Training]) {

  val locations: Set[Location] =
  // Could also be written in short notation: trainings flatMap (_.locations)
  trainings.flatMap(training => training.locations)
}
