
lazy val root = project
  .in(file("."))
  .aggregate(
    $name;format="camel"$JS, 
    $name;format="camel"$JVM
  )
  .settings(
    publish := {},
    publishLocal := {}
  )

lazy val $name;format="camel"$ = crossProject
  .in(file("."))
  .settings(
    name := "$name$",
    version := "$version$",
    scalaVersion := "2.11.7",
    scalacOptions ++= Seq(
      "-encoding", "UTF-8",
      "-deprecation", 
      "-feature", 
      "-Xlint"
    ),
    licenses += ("MIT", url("http://opensource.org/licenses/MIT")),
    libraryDependencies ++= Seq(
      "com.lihaoyi" %%% "utest" % "0.3.0" % "test"
    ),
    testFrameworks += new TestFramework("utest.runner.Framework")
  )
  //.jvmSettings()
  //.jsSettings()

lazy val $name;format="camel"$JVM = $name;format="camel"$.jvm
lazy val $name;format="camel"$JS = $name;format="camel"$.js

