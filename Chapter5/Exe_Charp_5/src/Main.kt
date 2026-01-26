    //Creating an Enum Class

    enum class SchnauzerBreed(val height: Int){
        MINIATURE(33),
        STANDARD(47),
        GIANT(65)
    }

    //Using Enum Classes with when Expressions

    fun describe(breed: SchnauzerBreed) = when(breed){
        SchnauzerBreed.MINIATURE -> "Miniature"
        SchnauzerBreed.STANDARD -> "Standard"
        SchnauzerBreed.GIANT -> "Giant"
    }

fun main() {
    println(describe(SchnauzerBreed.MINIATURE))
    println(describe(SchnauzerBreed.GIANT))
    println(describe(SchnauzerBreed.STANDARD))

    // Height property
    println("Mini height: ${SchnauzerBreed.MINIATURE.height}")
    println("Standard height: ${SchnauzerBreed.STANDARD.height}")
    println("Giant height: ${SchnauzerBreed.GIANT.height}")

}