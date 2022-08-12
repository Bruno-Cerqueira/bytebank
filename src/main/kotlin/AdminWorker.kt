abstract class AdminWorker(
    name: String,
    document: String,
    salary: Double,
    val password: Int,
) : Worker (
    name = name,
    document = document,
    salary = salary,
), Authenticate
{
    override fun authenticate(password: Int): Boolean {
        if(this.password == password){
            return true
        }
        return false
    }
}