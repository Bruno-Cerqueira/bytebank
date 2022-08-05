fun main() {
    /*var owner = "Bruno"
    println("Bem vindo ao Bytebank")
    println("Titular $owner")

    val account = 187
    var balance = 10.0

    balance += 12
    println("conta do titular $account")
    println("Saldo $balance")*/


    val account1 = Account()
    account1.name = "Alex"
    account1.number = 1000
    account1.balance = 200.0
    val account2 = Account()
    account2.name = "Fran"
    account2.number = 1001
    account2.balance = 300.0

    println("depositando na conta do Alex")
    account1.deposit(100.0)
    println(account1.balance)

    println("depositando na conta da Fran")
    account2.deposit(10.0)
    println(account2.balance)

    println("Sacando na conta do alex")
    account1.withdraw(300.0)
    println(account1.balance)

    println("Sacando na conta do Fran")
    account2.withdraw(400.0)
    println(account2.balance)

    println("TransferÊncia para conta do Alex")
    if(account2.transfer(200.0, account1)) {
        println("Sucesso")
    } else {
        println("Falha")
    }
    println(account1.balance)
    println(account2.balance)
}

class Account {
    var name = ""
    var number = 0
    var balance = 0.0

    fun deposit(value: Double) {
        balance += value
    }

    fun withdraw(value: Double) {
        if(this.balance >=value) {
            balance -= value
        }
    }

    fun transfer(value: Double, destination: Account): Boolean {
        if(this.balance >=value) {
            balance -= value
            destination.deposit(value)
            return true
        }
        return false
    }
}
