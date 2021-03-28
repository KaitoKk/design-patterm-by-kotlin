class CharDisplay(ch: Char): AbstarctDisplay() {
    val ch = ch

    override fun open() {
        print("<<")
    }

    override fun print() {
        print(ch)
    }

    override fun close() {
        println(">>")
    }
}