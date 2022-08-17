package br.com.firstpro.model

abstract class Worker(
    open var address: Address = Address(),
    val name: String,
    val document: String,
    val salary: Double
) {
    abstract val extra: Double
}
