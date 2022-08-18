package br.com.firstpro.model

import br.com.firstpro.exception.InsufficientMoneyException

class Account(
    var name: String,
    var number: Int,
) {
    var balance = 0.0
        private set

    fun deposit(value: Double) {
        balance += value
    }

    fun withdraw(value: Double) {
        if(this.balance >=value) {
            balance -= value
        }
    }

    fun transfer(value: Double, destination: Account) {
        if(balance < value) {
            throw InsufficientMoneyException("Saldo insuficente, saldo: $balance, transfer: $value")
        }
        balance -= value
        destination.deposit(value)
    }
}