class Account(private var balance: Double) {
  def applyInterest(): Unit = {
    balance *= (if (balance > 0) 1.05 else 1.1)
  }

  def getBalance: Double = balance
}

class Bank(private val accounts: List[Account]) {
    def getAllAccounts: List[Account] = accounts
    def getAccNegBalance: List[Account] =
        accounts.filter(_.getBalance < 0)

    def calculateTotalBalance: Double =
        accounts.map(_.getBalance).sum

    def applyInterestToAll(): Unit =
        accounts.foreach(_.applyInterest())

}


object BankAccount {

    def main(args: Array[String]): Unit = {
        val accounts = List(
            new Account(-1000.0),
            new Account(-2500.0),
            new Account(200.0),
            new Account(20000.0)

        )

    val bank = new Bank(accounts)

    println("Accounts with negative balances:")
    for ((account, index) <- bank.getAccNegBalance.zipWithIndex) {
        println(s"Account $index balance: ${account.getBalance}")
    }
    val totalBalance = bank.calculateTotalBalance
    println(s"Total balance of all accounts: $totalBalance")

    println("Balances after applying interest:")
    bank.applyInterestToAll()
    for ((account, index) <- bank.getAllAccounts.zipWithIndex) {
        println(s"Account $index balance: ${account.getBalance}")
}


  }


}



