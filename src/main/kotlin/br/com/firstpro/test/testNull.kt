package br.com.firstpro.test

import br.com.firstpro.model.Address

fun testNull () {
    val ad : Address? = Address("rua")
    val adName : String? = ad?.name
    println(adName)

    ad?.let { address ->
        println(address.name.length)
    }
}