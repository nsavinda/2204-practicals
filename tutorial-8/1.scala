object Interest {

  val interest: Int => Double = deposit_amount => deposit_amount match {
    case x if x < 20000 => x * 0.02
    case x if x < 200000 => x * 0.04
    case x if x < 2000000 => x * 0.035
    case x if x >= 2000000 => x * 0.065
  }

  def main(args: Array[String]): Unit = {
    println("Interest: " + interest(args(0).toInt))
  }


}