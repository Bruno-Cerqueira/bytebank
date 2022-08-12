class Director (
    name: String,
    document: String,
    salary: Double,
    password: Int,
    val plr: Double,
    ) : AdminWorker (
    name = name,
    document = document,
    salary = salary,
    password = password
) {
    override val extra: Double
        get() = salary * 0.2
}