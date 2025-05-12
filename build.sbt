organization := "kk.keke"

version := "0.1.0"

name := "firclean"

scalaVersion := "2.13.12"

scalacOptions ++= Seq("-deprecation", "-unchecked")

libraryDependencies += "edu.berkeley.cs" %% "firrtl" % "1.5.6"

assemblyJarName in assembly := "firclean.jar"

assemblyOutputPath in assembly := file("./firclean.jar")
