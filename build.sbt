name := "pb"
organization := "com.simplesys"
version := "0.3-SNAPSHOT"
scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
    "com.github.nscala-time" %% "nscala-time" % "2.16.0",
    "jline" % "jline" % "2.14.5",
    "org.scalatest" %% "scalatest" % "3.0.4" % Test
)

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
homepage := Some(url("http://github.com/a8m/pb-scala"))

publishMavenStyle := false

publishTo := {
    val corporateRepo = "http://toucan.simplesys.lan/"
    if (isSnapshot.value)
        Some("snapshots" at corporateRepo + "artifactory/libs-snapshot-local")
    else
        Some("releases" at corporateRepo + "artifactory/libs-release-local")
}
credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")
publishArtifact in Test := false

