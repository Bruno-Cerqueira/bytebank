package br.com.firstpro.test

import br.com.firstpro.model.Address

fun testingExceptions() {
    println("início main")
    try {
        10/0
    } catch (e: ArithmeticException) {
        println("ClassCastException foi pegada")
    }
    funcao1()
    println("fim main")
}



fun funcao1() {
    println("início funcao1")
    try {
        funcao2()
    } catch (e: ClassCastException) {
        println("ClassCastException foi pegada")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5) {
            println(i)
            val endereco = Any()
            endereco as Address
    }
    println("fim funcao2")
}