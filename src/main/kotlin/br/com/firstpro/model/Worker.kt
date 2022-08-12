package br.com.firstpro.model

abstract class Worker(
    val name: String,
    val document: String,
    val salary: Double
) {
    abstract val extra: Double
}
