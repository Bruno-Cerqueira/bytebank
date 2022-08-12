open class Worker(
    val name: String,
    val document: String,
    val salary: Double
) {
    open fun extra(): Double {
        return salary * 0.01
    }
}
