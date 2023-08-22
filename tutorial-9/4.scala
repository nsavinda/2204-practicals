class Account(private var balance: Double) {
  def applyInterest(): Unit = {
    balance *= (if (balance > 0) 1.05 else 1.1)
  }

  def getBalance: Double = balance
}

class Bank(private val accounts: List[Account]) {
    def getAllAccounts: List[Account] = accounts
    def getAccountsWithNegativeBalance: List[Account] =
        accounts.filter(_.getBalance < 0)

    def calculateTotalBalance: Double =
        accounts.map(_.getBalance).sum

    def applyInterestToAllAccounts(): Unit =
        accounts.foreach(_.applyInterest())

    def getFinalBalancesAfterInterest: List[Double] =
        accounts.map { account =>
        account.applyInterest()
        account.getBalance
        }
}


object BankAccount {

    def main(args: Array[String]): Unit = {
        val accounts = List(
            new Account(100.0),
            new Account(-200.0),
            new Account(500.0)
        )

    val bank = new Bank(accounts)

    println("Accounts with negative balances:")
    bank.getAccountsWithNegativeBalance.foreach(account => println(account.getBalance))

    val totalBalance = bank.calculateTotalBalance
    println(s"Total balance of all accounts: $totalBalance")

    println("Balances after applying interest:")
    bank.applyInterestToAllAccounts()
    bank.getAllAccounts.foreach(account => println(account.getBalance))

    println("Final balances after interest:")
    val finalBalances = bank.getFinalBalancesAfterInterest
    finalBalances.foreach(balance => println(balance))

  }


}



