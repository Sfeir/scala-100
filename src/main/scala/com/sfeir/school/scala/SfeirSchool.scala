package com.sfeir.school.scala

/**
  * Sfeir School - Scala 100
  */
case class SfeirSchool(trainings: Set[Training]) {

  val locations: Set[Location] =
  // Could also be written in short notation: trainings flatMap (_.locations)
  trainings.flatMap(training => training.locations)

  def trainingsAt(location: Location): Set[Training] =
    // Could also be written in short notation: trainings.filter(_.locations contains location)
    trainings.filter(training => training.locations contains location)
}
