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

    fun transfer(value: Double, destination: Account): Boolean {
        if(this.balance >=value) {
            balance -= value
            destination.deposit(value)
            return true
        }
        return false
    }
}