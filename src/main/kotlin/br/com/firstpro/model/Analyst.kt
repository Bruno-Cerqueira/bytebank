package br.com.firstpro.model

class Analyst (
    name: String,
    document: String,
    salary: Double,
    override var address: Address = Address(),
) : Worker(
    name = name,
    document = document,
    salary = salary,
    address = address,
)
{
    override val extra: Double
        get() = salary * 0.2
}