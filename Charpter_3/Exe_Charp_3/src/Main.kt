

fun main() {
   val temperature =-7

    //Introduction to when in Kotlin

    //val reaction = when {
    //    temperature > 55 -> "It's too hot!"
    //    temperature < 40 -> "It's too cold!"
    //    else -> "It's just right!"
    //}

    //The first true condition wins

    val reaction = when {
        temperature > 55 -> "It's too hot!"
        temperature < 40 -> "It's too cold!"
        temperature < 0 -> "It's frigid!"
        else -> "It's just right!"
    }

    //Exact matches
    //val quantity = 2

    //val pricePerBook = when {
        //quantity == 1 -> 19.99
        //quantity == 2 -> 18.99
        //quantity == 3 -> 16.99
        //quantity == 4 -> 16.99
      //  else -> 14.99
    //}

    //val pricePerBook = when (quantity) {
        //1-> 19.99
        //2-> 18.99
        //3-> 16.99
       // 4-> 16.99
     //   else -> 14.99
    //}

    val quantity = 3
    val pricePerBook = when (quantity) {
        1-> 19.99
        2-> 18.99
        3, 4 -> 16.99
        else -> 14.99
    }

    //Every Condition Must Be Accounted For

    val isLightbulbOn = true
    val reaction2 = when (isLightbulbOn) {
        true
            -> "It's bright"
        false -> "I can't see"
    }

    //if Expressions

    var isLightbulbOff = true

    val reacion3 = if (isLightbulbOff) {
        isLightbulbOff = false
        "I just turned the light off"
        } else {
        isLightbulbOff = true
        "I just turned he light on"
    }

    println(reaction)
    println(pricePerBook)
    println(reaction2)
    println(reacion3)
}