object EvenOrOdd {
  def isEvenOrOdd(n: Int): String = if(n == 0) "Even" else if (n == 1)  "Odd" else isEvenOrOdd(n-2);

  def main(args:Array[String]): Unit = {
    println(isEvenOrOdd(7))
  }

}