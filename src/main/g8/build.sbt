name := """$name$"""
organization := "$organization$"

version := "$version$"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "$scala_version$"

libraryDependencies ++= {
  Seq(
    filters,
    // ws,
    // cache,
    "org.scalatestplus.play" %% "scalatestplus-play" % "2.0.0" % Test,
    "org.webjars.npm" % "typescript" % "2.1.4",
    "org.webjars.npm" % "tslint-eslint-rules" % "3.1.0",
    "org.webjars.npm" % "tslint-microsoft-contrib" % "2.0.12",
    "org.webjars.npm" % "systemjs" % "0.19.40",
    "org.webjars.npm" % "rxjs" % "5.0.0-beta.12",
    "org.webjars.npm" % "reflect-metadata" % "0.1.8",
    "org.webjars.npm" % "zone.js" % "0.6.26",
    "org.webjars.npm" % "core-js" % "2.4.1",
    "org.webjars.npm" % "node-normalize-scss" % "1.3.2"
  )
}
dependencyOverrides += "org.webjars.npm" % "minimatch" % "3.0.0"

// use the webjars npm directory (target/web/node_modules ) for resolution of module imports of angular2/core etc
resolveFromWebjarsNodeModulesDir := true

// use the combined tslint and eslint rules
(rulesDirectories in tslint) := Some(List(
  tslintEslintRulesDir.value
))

logLevel in tslint := Level.Debug
routesGenerator := InjectedRoutesGenerator

fork in run := true
// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.phirschi.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.phirschi.binders._"
