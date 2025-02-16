class Book(var title: String, var author: String, var yearPublished: Int, var genre: String) {
    fun getBookInfo() {
        println("$title by $author ($yearPublished), $genre")
    }
}

fun main() {
    val myBook = Book("Annie Bot", "Sierra Greer", 2024, "Science Fiction");
    myBook.getBookInfo()
}