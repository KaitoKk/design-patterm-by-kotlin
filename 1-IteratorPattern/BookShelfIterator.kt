class BookshelfIterator(bookShelf: BookShelf) : Iterator {
    private val bookShelf = bookShelf
    private var index: Int = 0

    override fun hasNext(): Boolean {
        if (index < bookShelf.getLength())
            return true
        return false
    }

   override fun next(): Any {
        val book = bookShelf.getBookAt(index)
        index++
        return book as Any
    }
}