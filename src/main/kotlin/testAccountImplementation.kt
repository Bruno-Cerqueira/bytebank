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
    if (account2.transfer(5.0, account1)) {
        println("Sucesso")
    } else {
        println("Falha")
    }
    println(account1.balance)
    println(account2.balance)
}