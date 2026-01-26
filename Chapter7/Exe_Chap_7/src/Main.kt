//Bert’s Snips & Clips

// Tax is 9%, so we'll multiply by 109% to get the total with tax included  .
//val taxMultiplier = 1.09
//fun calculateTotalWithFiveDollarDiscount(initialPrice: Double): Double {
  //  val priceAfterDiscount = initialPrice - 5.0
    //val total = priceAfterDiscount * taxMultiplier
    //return total
//}

//fun main() {
  //  val total = calculateTotalWithFiveDollarDiscount(20.0)
    //println("€%.2f".format(total))
//}


//Passing Functions to Functions with Lambda

val taxMultiplier = 1.09

fun calculateTotal(
    initialPrice: Double,
    applyDiscount: (Double) -> Double // This expects a function as a parameter
): Double {
    // Apply coupon discount
    val priceAfterDiscount = applyDiscount(initialPrice)
    // Apply tax
    val total = priceAfterDiscount * taxMultiplier
    return total
}

// 3 discount strategies
fun discountFiveDollars(price: Double): Double = price - 5.0
fun discountTenPercent(price: Double): Double = price * 0.9
fun noDiscount(price: Double): Double = price

// These calculate the values using the '::' syntax to pass the function
val withFiveDollarsOff = calculateTotal(20.0) { price -> price - 5.0 } // $16.35
val withTenPercentOff= calculateTotal(20.0) { price -> price * 0.9 } // $19.62
val fullPrice= calculateTotal(20.0) { price -> price } // $21.80

fun main() {
    println("With $5.00 off:  €%.2f".format(withFiveDollarsOff))// $16.35
    println("With 10%% off:    €%.2f".format(withTenPercentOff))// $19.62
    println("Full Price:      €%.2f".format(fullPrice))// $21.80
}

