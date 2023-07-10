object PrimeSeq {

  def checkPrime(n: Int, i: Int = 2): Boolean = if(n <= 2)  n == 2 else if(n % i == 0)  false else if(i * i > n) true else checkPrime(n, i + 1)


  def primeSeq(n: Int, num: Int = 2): Unit = {
    if (num < n) {
      if (checkPrime(num))
        println(num + " ")
      primeSeq(n, num + 1)
    }
  }
  def main(args: Array[String]): Unit = {
    primeSeq(10)
  }

}