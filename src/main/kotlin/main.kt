import br.com.firstpro.test.testNull
import br.com.firstpro.test.testingExceptions

fun main() {
    /*var owner = "Bruno"
    println("Bem vindo ao Bytebank")
    println("Titular $owner")

    val account = 187
    var balance = 10.0

    balance += 12
    println("conta do titular $account")
    println("Saldo $balance")*/

    testNull()

}

fun printTest(value: Any): Any {
    println(value);
    return value;
}
