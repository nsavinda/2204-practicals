class Rational(n: Int, d: Int) {
  require(d != 0, "deinator cannot be zero")

  val nu: Int = n
  val de: Int = d

  def sub(other: Rational): Rational = {
    new Rational(nu * other.de - other.nu * de, de * other.de)
  }

  def printRational: String = s"$nu/$de"
}

object RationalNumber {

    def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)
    
    val result = (x.sub(y)).sub(z)
    println(result.printRational)
  }


}