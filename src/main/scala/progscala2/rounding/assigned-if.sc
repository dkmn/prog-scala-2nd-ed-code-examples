// src/main/scala/progscala2/rounding/assigned-if.sc

val configFile = new java.io.File("/Users/david/Documents/Programming/prog-scala-2nd-ed-code-examples/src/main/scala/progscala2/typelessdomore/tuple-example.sc")

val configFilePath = if (configFile.exists()) {
  configFile.getAbsolutePath()
} else {
  configFile.createNewFile()
  configFile.getAbsolutePath()
}

