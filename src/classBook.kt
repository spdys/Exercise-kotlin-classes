class Book(var title: String, var author: String, var yearPublished: Int) {
    fun getBookInfo() {
        println("$title by $author ($yearPublished)")
    }
}

fun main() {
    val myBook = Book("Annie Bot", "Sierra Greer", 2024);
    myBook.getBookInfo()
}