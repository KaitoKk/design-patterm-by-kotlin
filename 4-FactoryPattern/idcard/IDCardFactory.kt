package idcard
import framework.*

class IDCardFactory: Factory() {
    var owners: List<Product?> = ArrayList()

    override fun createProduct(owner: String): Product {
        return IDCard(owner)
    }

    override fun registerProduct(product: Product) {
        owners.add( ((product as IDCard).getOwner() )
    }

    fun getOwners(): List<Product?> {
        return owners
    }
}
