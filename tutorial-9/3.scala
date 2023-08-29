class Account(private var balance: Double = 0.0) {
  require(balance >= 0.0, "Initial balance cannot be negative")

  def deposit(amount: Double): Unit = {
    try {
    require(amount > 0.0, "Deposit amount must be positive")
    balance += amount
    }
    catch {
      case ex: IllegalArgumentException =>
        println(s"Error: ${ex.getMessage}") 
    }
    
  }
  def withdraw(amount: Double): Unit = {
    try {
      require(amount > 0.0, "Withdrawal amount must be positive")
      require(amount <= balance, "Insufficient balance for withdrawal")
      balance -= amount
    } catch {
      case ex: IllegalArgumentException =>
        println(s"Error: ${ex.getMessage}")

    }
  }

  def transfer(amount: Double, toAccount: Account): Unit = {
    try {
      require(amount > 0.0, "Transfer amount must be positive")
      require(amount <= balance, "Insufficient balance for transfer")
      withdraw(amount)
      toAccount.deposit(amount)
    } catch {
      case ex: IllegalArgumentException =>
        println(s"Error: ${ex.getMessage}")
    }
  }

  def getBalance: Double = balance
}

object BankAccount {

    def main(args: Array[String]): Unit = {
        val account1 = new Account(10000.0)
        val account2 = new Account(4000.0)

        println(s"Account 1 balance: ${account1.getBalance}")
        println(s"Account 2 balance: ${account2.getBalance}")

        account1.deposit(2500.0)
        account1.withdraw(5000.0)
        account1.transfer(400.0, account2)

        println(s"Account 1 balance: ${account1.getBalance}")
        println(s"Account 2 balance: ${account2.getBalance}")

  }


}
