// src/main/scala/progscala2/typelessdomore/method-broad-inference-return.sc

def makeList(strings: String*) : List[String] = {
  if (strings.length == 0)
    List.empty[String]  // #1
  else
    strings.toList
}

val list: List[String] = makeList()  // ERROR
