// src/main/scala/progscala2/typelessdomore/factorial.sc

def factorial(i: Int): Long = {
  def fact(j: Int, accumulator: Long): Long = {
    if (j <= 1) accumulator
    else fact(j - 1, j * accumulator)
  }
    
  fact(i, 1L)
}

(0 to 6) foreach ( i => println(factorial(i)) )
