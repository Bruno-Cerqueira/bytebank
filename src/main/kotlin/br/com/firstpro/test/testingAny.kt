package br.com.firstpro.test

import br.com.firstpro.model.Analyst

val worker1 = Analyst(
    salary = 10.0,
    name = "Joao",
    document = "241"
)

val worker2 = Analyst(
    salary = 120.0,
    name = " Maria",
    document = "34124"
)

fun testingAny() {
println(worker1.equals(worker2))
println(worker1.hashCode())
println(worker2.hashCode())
}
