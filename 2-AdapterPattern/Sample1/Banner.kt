class Banner(string:String){
    val string: String = string

    fun showWithParen {
        println("($string)")
    }

    fun showWithAster {
        println("*$string*")
    }
}