class Manager (
    name: String,
    document: String,
    salary: Double,
    password: Int,
) : AdminWorker (
    name = name,
    document = document,
    salary = salary,
    password = password,
) {
        override val extra: Double
            get() = salary * 0.2

}