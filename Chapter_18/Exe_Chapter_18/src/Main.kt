//Mugs and Beverages

//sealed interface Beverage
//enum class Tea : Beverage { GREEN_TEA, BLACK_TEA, RED_TEA }
//enum class Coffee : Beverage { LIGHT_ROAST, MEDIUM_ROAST, DARK_ROAST }
//class Mug(val beverage: Beverage)
//fun drink(tea: Tea) = println("Drinking tea: $tea")
//class CoffeeMug(val coffee: Coffee)
//class TeaMug(val tea: Tea)
//fun drink(coffee: Coffee) = println("Drinking coffee: $coffee")

//val mugOfCoffee = Mug(Coffee.LIGHT_ROAST)

//fun main() {
  //  drink(mugOfCoffee.beverage as Coffee)

//}


//Introduction to Generic Types

sealed interface Beverage {
    val idealTemperature: Int
}

enum class Tea : Beverage {
    GREEN_TEA, BLACK_TEA, RED_TEA;
    override val idealTemperature = 140
}

enum class Coffee : Beverage {
    LIGHT_ROAST, MEDIUM_ROAST, DARK_ROAST;
    override val idealTemperature = 135
}

class Mug<out T : Beverage>(val beverage: T)

fun <T : Beverage> serve(beverage: T): Mug<T> = Mug(beverage)

fun main() {
    val mug: Mug<Beverage> = Mug(Coffee.MEDIUM_ROAST)

    when (mug.beverage) {
        is Tea -> println("Sipping on tea: ${mug.beverage}!")
        is Coffee -> println("Sipping on coffee: ${mug.beverage}!")
    }
}