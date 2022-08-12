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
    override fun extra(): Double {
        return salary + plr
    }
}