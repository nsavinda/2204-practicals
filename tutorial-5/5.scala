object Add {
  def addEven(n: Int): Int = if(n <= 0)  0 else if(n % 2 == 0) n + addEven(n - 2) else addEven(n - 1);

  def main(args: Array[String]): Unit = {
    println(addEven(7))
  }


}