object Prime {

  def checkPrime(n: Int, i: Int = 2): Boolean = if(n <= 2)  n == 2 else if(n % i == 0)  false else if(i * i > n) true else checkPrime(n, i + 1)
  
  def main(args: Array[String]): Unit = {
    if(checkPrime(5)) {
      println("Is a prime number")
    }
    else {
      println("Not a prime number")
    }
  }


}