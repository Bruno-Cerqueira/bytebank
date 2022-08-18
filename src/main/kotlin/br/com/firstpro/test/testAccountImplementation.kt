import br.com.firstpro.exception.InsufficientMoneyException
import br.com.firstpro.model.Account

fun testAccountImplementation() {
    val account1 = Account("Alex", 1000)
    val account2 = Account(number = 2000, name = "Fran")

    println("depositando na conta do Alex")
    account1.deposit(100.0)
    println(account1.balance)

    println("depositando na conta da Fran")
    // account2.balance = 10.0
    account2.deposit(10.0)
    println(account2.balance)

    println("Sacando na conta do alex")
    account1.withdraw(30.0)
    println(account1.balance)

    println("Sacando na conta do Fran")
    account2.withdraw(4.0)
    println(account2.balance)

    println("TransferÊncia para conta do Alex")
    try {
        account2.transfer(7.0, account1)
        println("TransferÊncia para conta do Alex")
        println("Sucesso")
    } catch (e: InsufficientMoneyException) {
        println(e.message)
    }
    println(account1.balance)
    println(account2.balance)
}