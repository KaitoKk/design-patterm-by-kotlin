fun main(args: Array<String>) {
    val bookShelf = BookShelf(4);
    bookShelf.appendBook(Book("Arround the World in 80 Days"))
    bookShelf.appendBook(Book("Bible"))
    bookShelf.appendBook(Book("Cinderella"))
    bookShelf.appendBook(Book("Daddy-Long-Legs"))

    val it = bookShelf.iterator()
    while(it.hasNext()) {
        val book:Book = it.next() as Book
        println(book.name)
    }
}