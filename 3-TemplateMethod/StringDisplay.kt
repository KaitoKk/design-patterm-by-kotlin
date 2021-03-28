class StringDisplay(str: String): AbstarctDisplay() {
    val str = str
    val length = str.length

    override fun open() {
        printLine()
    }

    override fun print() {
        println("|$str|")
    }

    override fun close() {
        printLine()
    }

    fun printLine() {
        print("+")
        for(i in 1..length) {
            print("-")
        }
        println("+")
    }
}