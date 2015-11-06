name := "flatentity"

version := "1.0"

scalaVersion := "2.11.7"

lazy val flatentityCore = Project("flatentity-core", file("flatentity-core"))

lazy val flatentitySample = Project("flatentity-sample", file("flatentity-sample"))
  .dependsOn(flatentityCore)
