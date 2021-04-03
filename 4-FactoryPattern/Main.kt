import framework.*
import idcard.*

fun main() {
    val factory: Factory = IDCardFactory()
    val card1: Product = factory.createProduct("kaito")
    val card2: Product = factory.createProduct("carp")
    val card3: Product = factory.createProduct("yamaha")
    val card4: Product = factory.createProduct("ezono")

    
}