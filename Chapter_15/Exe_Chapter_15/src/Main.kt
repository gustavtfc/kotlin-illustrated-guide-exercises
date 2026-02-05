// Chapter 15 - Data Classes and Destructuring

//class DollarBill(val amount: Int) {
  //  override fun equals(other: Any?) =
    //    if (other is DollarBill) amount.equals(other.amount) else false
  //  override fun hashCode() = amount.hashCode()
//}

//fun main () {
  //  val denominations = mutableSetOf<DollarBill>()
    //denominations.add(DollarBill(1))
    //denominations.add(DollarBill(2))
    //denominations.add(DollarBill(5))
    //println(denominations.size) // 3

//}

//Introduction to Data Classes

//data class Address(
  //  val street: String,
    //val city: String,
    //val postalCode: String
//)

//fun main () {

  //  val address1 = Address("1234 Maple Ave", "Berrytown", "567890")
    //val address2 = Address("123 Maple Ave", "Berrytown", "56789")
   // address1 == address2

   // mutableSetOf(address1, address2).size // 1
//    println(address1)

//}

//Destructuring and the Standard Library

fun main () {
    val association = "Nail" to "Hammer"
    val (hardware, tool) = association


    val toolbox = mapOf(
        "Nail" to "Hammer",
        "Bolt" to "Wrench",
        "Screw" to "Screwdriver"
    )

    toolbox.forEach { (hardware, tool) ->
        println("Use a $tool on a $hardware")
    }

}