class Director (
    name: String,
    document: String,
    salary: Double,
    val plr: Double,
    ) : Worker (
    name = name,
    document = document,
    salary = salary,
) {
    override val extra: Double
        get() = salary * 0.2
}