//Introduction to Class Delegation

// 1. Interfaces
interface KitchenStaff {
    fun prepareEntree(name: String): Entree?
    fun receiveCompliment(message: String)
}

interface BarStaff {
    fun prepareBeverage(name: String): Beverage?
    fun receiveCompliment(message: String)
}

// 2. Classes
class Bartender : BarStaff {
    override fun prepareBeverage(name: String): Beverage? = when (name) {
        "Water" -> Beverage.WATER
        "Soda" -> Beverage.SODA
        "Peach Tea" -> Beverage.PEACH_ICED_TEA
        "Tea-Lemonade" -> Beverage.TEA_LEMONADE
        else -> null
    }

    override fun receiveCompliment(message: String) {
        println("Bartender received a compliment: $message")
    }
}

class Chef : KitchenStaff {
    override fun prepareEntree(name: String): Entree? = when (name) {
        "Tossed Salad" -> Entree.TOSSED_SALAD
        "Salmon on Rice" -> Entree.SALMON_ON_RICE
        else -> null
    }

    override fun receiveCompliment(message: String) {
        println("Chef received a compliment: $message")
    }
}

// 3. The Waiter (Using Delegation 'by')
class Waiter(
    private val chef: Chef,
    private val bartender: Bartender
) : KitchenStaff by chef, BarStaff by bartender {

    override fun receiveCompliment(message: String) {
        when {
            message.contains("entree") -> chef.receiveCompliment(message)
            message.contains("beverage") -> bartender.receiveCompliment(message)
            else -> println("Waiter received compliment: $message")
        }
    }

    override fun prepareEntree(name: String): Entree? =
        if (name == "Tossed Salad") {
            println("Waiter grabbing a pre-made salad...")
            Entree.TOSSED_SALAD
        } else {
            chef.prepareEntree(name)
        }

    fun acceptPayment(money: Int) = println("Thank you for paying $money dollars.")
}

// 4. Enums (Data)
enum class Entree { TOSSED_SALAD, SALMON_ON_RICE }
enum class Beverage { WATER, SODA, PEACH_ICED_TEA, TEA_LEMONADE }


// 5. Run it!
fun main() {
    val waiter = Waiter(Chef(), Bartender())

    waiter.receiveCompliment("The salmon entree was fantastic!") // Goes to Chef
    waiter.receiveCompliment("The peach tea beverage was fantastic!") // Goes to Bartender
    waiter.receiveCompliment("The service was fantastic!") // Stays with Waiter

    println("---")

    // Test Orders
    val drink = waiter.prepareBeverage("Peach Tea")
    val food = waiter.prepareEntree("Salmon on Rice")

    println("Served: $drink and $food")
    waiter.acceptPayment(25)
}