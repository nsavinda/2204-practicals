class Rational(n: Int, d: Int) {

    val numer: Int = n
    val denom: Int = d

    def neg: Rational = new Rational(-numer, denom)
    def printRational: String = s"$numer/$denom"
}


object RationalNumber {

    def main(args: Array[String]): Unit = {
        val a = new Rational(16, 5)
        // println(a.printRational)
        val negA = a.neg
        println(negA.printRational)
  }


}