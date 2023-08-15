object PatternMatching {
    val check: Int => String = {
        case x if x <= 0 => "Negative/Zero"
        case x if x % 2 == 0 => "Even number is given"
        case x if x % 2 != 0 => "Odd number is given"
  }
    def main(args: Array[String]): Unit = {
        println(check(args(0).toInt))
  }


}