fun main(args: Array<String>) {
    val p: Print = PrintBanner("${args[0]}")

    p.printWeak()
    p.printStrong()
}