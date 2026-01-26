//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Introduction to Nulls

    class CoffeeReview(
        val name: String,
        val comment: String,
        val stars: Int?
    )

    val saraReview = CoffeeReview("Sara", "Loved the coffee!", 5)
    val tobyReview = CoffeeReview("Toby", "Pretty good!", 4)
    val lucyReview = CoffeeReview("Lucy", "Will buy this again!", null)


    fun printReview(review: CoffeeReview) =
        println("${review.name} gave it ${review.stars} stars!")
    println("Latest coffee reviews")
    println("---------------------")

    printReview(saraReview)
    printReview(tobyReview)
    printReview(lucyReview)

    //Using Conditionals to Check for null


}

// Find error!!

data class Payment(val amount: Double)
data class Coffee(val type: String)

fun orderCoffee(payment: Payment): Coffee {
    println("Processing payment $${payment.amount}")
    return Coffee("Espresso")
}

fun main() {
    val payment: Payment? = Payment(3.50)
    payment?.let {
        val coffee = orderCoffee(it)
        println("Got ${coffee.type}")
    } ?: println("No payment, no coffee")
}
