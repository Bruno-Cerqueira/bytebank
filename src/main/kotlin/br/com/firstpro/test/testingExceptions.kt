package br.com.firstpro.test

import br.com.firstpro.exception.InsufficientMoneyException
import java.lang.NumberFormatException

fun testingExceptions() {
    println("início main")
    try {
        10/0
    } catch (e: ArithmeticException) {
        e.printStackTrace()
        println("ClassCastException foi pegada")
    }
    funcao1()
    println("fim main")
}

fun testingBlockExpressions() {
    val value = "1.2"
    val data: Double? = try {
        value.toDouble()
    } catch (e: NumberFormatException) {
        println(e.message)
        null
    }

    println(data)
}



fun funcao1() {
    println("início funcao1")
    try {
        funcao2()
    } catch (e: InsufficientMoneyException) {
        println(e.message)
        println(e.stackTrace)
        println(e.cause)
        println("ClassCastException foi pegada")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5) {
            println(i)
            val endereco = Any()
            throw InsufficientMoneyException()
    }
    println("fim funcao2")
}