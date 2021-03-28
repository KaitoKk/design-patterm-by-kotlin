fun main() {
    val d1:AbstarctDisplay = CharDisplay('H')
    d1.display()
    println()

    val d2: AbstarctDisplay = StringDisplay("hogefuga")
    d2.display()

    val d3: AbstarctDisplay = StringDisplay("ほげふが")
    d3.display()
}