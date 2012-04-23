scalaVersion := "2.9.1-1"

libraryDependencies ++= Seq(
  "org.specs2" % "specs2_2.9.1" % "1.8.1" % "test"
)

scalacOptions ++= Seq("-encoding", "UTF-8", "-deprecation", "-unchecked")
