import sbt._

object Dependencies {

  private val breeze = "0.13"

  lazy val core = Seq(
    "org.locationtech.jts" %  "jts-core"       % "1.16.0",
    // -- breeze --
    "org.scalanlp"       %% "breeze"         % breeze,
    "org.scalanlp"       %% "breeze-natives" % breeze
  )

  lazy val spray = Seq(
    "io.spray" %% "spray-json" % "1.3.2"
  )

  lazy val circe = Seq(
    "io.circe" %% "circe-core",
    "io.circe" %% "circe-generic",
    "io.circe" %% "circe-parser"
  ).map(_ % "0.9.3")

  lazy val test = Seq(
    "org.scalatest"           %% "scalatest"                    % "3.0.1",
    "org.scalacheck"          %% "scalacheck"                   % "1.13.4",
    "org.scalamock"           %% "scalamock-scalatest-support"  % "3.5.0",
    "org.pegdown"             %  "pegdown"                      % "1.4.2"
  ).map(_ % "test")
}
