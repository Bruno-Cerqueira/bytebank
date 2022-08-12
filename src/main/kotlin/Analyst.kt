class Analyst (
    name: String,
    document: String,
    salary: Double,
) : Worker(
    name = name,
    document = document,
    salary = salary,
)
{
    override fun extra(): Double {
        return salary * 0.05
    }
}