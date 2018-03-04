
lazy val root = project.in(file(".")).
    aggregate(crossTestJVM, crossTestJS)

lazy val crossTest = crossProject.
    crossType(CrossType.Pure).
    in(file("crossTest")).
    settings(
        name := "crossTest",
        version := "0.1",
        licenses := Seq("MIT license" -> url("http://www.opensource.org/licenses/mit-license.php")),

        libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5" % Test,
        libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
    )

lazy val crossTestJVM = crossTest.jvm
lazy val crossTestJS = crossTest.js