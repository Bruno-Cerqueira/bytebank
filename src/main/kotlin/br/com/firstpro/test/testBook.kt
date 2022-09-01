package br.com.firstpro.test

fun testBook() {
    val livro1 = Book(
        title = "Grande Sertão: Veredas",
        author = "João Guimarães Rosa",
        releaseDate = 1956
    )

    val livro2 = Book(
        title = "Grande Sertão: Veredas2",
        author = "João Guimarães Rosa2",
        releaseDate = 1956
    )

    val livro4 = Book(
        title = "Iracema",
        author = "José de Alencar",
        releaseDate = 1865,
        company = "Editora B"
    )

    val books: MutableList<Book> = mutableListOf(livro1, livro2, livro4)

    books.add(
        Book(
            title = "Sagarana",
            author = "João Guimarães Rosa",
            releaseDate = 1946
        )
    )

    val ordenadoAnoPublicacao: List<Book> = books.sorted()
    ordenadoAnoPublicacao.imprimeComMarcadores()


    val titulos: List<String> = books
        .filter { it.author.startsWith("J") }
        .sortedBy { it.releaseDate }
        .map { it.title }
    println(titulos)

}


fun List<Book?>.imprimeComMarcadores() {
    val textoFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n") {
            " - ${it.title} de ${it.author}"
        }
    println(" #### Lista de Livros #### \n$textoFormatado")
}


data class Book (
    val author: String,
    val releaseDate: Long,
    val title: String,
    var company: String? = null,
) : Comparable<Book> {
    override fun compareTo(other: Book): Int {
        return this.title.compareTo(other.title)
    }
}


data class Library (
    val genre: String,
    val books: List<Book>
) {
    fun byAuthor(): List<Book> {
        return books.sortedBy { it.author }
    }

    fun organizarPorAnoPublicacao(): List<Book> {
        return books.sortedBy { it.releaseDate }
    }
}