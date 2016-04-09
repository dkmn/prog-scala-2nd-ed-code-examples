// src/main/scala/progscala2/typelessdomore/semicolon-example.sc

// Trailing equals sign indicates more code on the next line.
def equalsign(s: String) =
  println("equalsign: " + s)

// Trailing opening curly brace indicates more code on the next line.
def equalsign2(s: String) = {
  println("equalsign2: " + s)
}

// Trailing commas, periods, and operators indicate more code on the next line.
def commas(s1: String,
           s2: String) = Console.
  println("comma: " + s1 + 
          ", " + s2)

equalsign("hello")

equalsign2("hello")

commas("hello", "dave")

1 to 10
1 until 10
1 to 10 by 3
10 to 1 by -3
1 to 10 by 4
1L to 10L by 3
1.1f to 10.3f by 3.1f
1.1f to 10.3f by 0.5f
'a' to 'g' by 3
BigInt(1) to BigInt(10) by 3
BigDecimal(1.1) to BigDecimal(10.3) by 3.1
