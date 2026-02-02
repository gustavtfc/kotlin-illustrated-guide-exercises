//Sue Starts a Farm - (Classes overloading)

//fun main() {

  //  class Pig(val name: String, val excitementLevel: Int) {
    //    fun speak() {
      //          println("Oink!")
        //        }
    //}

    //class Cow(val name: String, var excitementLevel: Int = 0) {
      //  fun speak() = println("Mooo!")
    //}
    //class Chicken(val name: String, var numberOfEggs: Int = 0) {
      //  fun speak() = println("Cluck!")
    //}

    //class Farmer(val name: String) {

      //  fun greet(cow: Cow){
        //    println("Morniiiiing, ${cow.name}!")
          //  cow.speak()
        //}
        //fun greet(chicken: Chicken) {
          //  println("Good morning, ${chicken.name}!")
            //chicken.speak()

        //}
        //fun greet(pig: Pig) {
          //  println("Good morning, ${pig.name}!")
           // pig.speak()
        //}
    //}
    //val mimoza = Cow("Mimoza")
    //val sue = Farmer("Sue")
    //val henrietta = Chicken("Henrietta")
    //val spiderPig = Pig("SpiderPig", 1)
    //sue.greet(henrietta)
    //sue.greet(spiderPig)
    //sue.greet(mimoza)
//}


//Introducing Interfaces
//interface FarmAnimal {
  //  val name: String
    //fun speak()
//}

//class Cow(override val name: String) : FarmAnimal {
  //  override fun speak() = println("Moo!")
//}

//class Pig(override val name: String) : FarmAnimal {
  //  override fun speak() = println("Oink!")
//}

//class Chicken(override val name: String) : FarmAnimal {
  //  override fun speak() = println("Cluck!")
//}

//class Farmer(val name: String) {
  //  fun greet(animal: FarmAnimal) {
    //    println("Good morning, ${animal.name}!")
      //  animal.speak()
   // }
//}

//fun main() {
    //val sue = Farmer("Sue")

    //val animals: List<FarmAnimal> = listOf(
        //Chicken("Merilu"),
        //Pig("Spider Pig"),
      //  Cow("Mimoza"),
    //)

  //  animals.forEach { sue.greet(it) }
//}

//Smart Casts

interface FarmAnimal {
    val name: String
    fun speak()
}

class Chicken(override val name: String, val numberOfEggs: Int = 0) : FarmAnimal {
    override fun speak() = println("Cluck!")
}

class Cow(override val name: String) : FarmAnimal {
    override fun speak() = println("Moo!")
}

class Pig(override val name: String) : FarmAnimal {
    override fun speak() = println("Oink!")
}

class Farmer(val name: String) {
    fun greet(animal: FarmAnimal) {
        println("Hello, ${animal.name}!")


        if (animal is Chicken) {
            println("I see you have ${animal.numberOfEggs} eggs today!")
        }

        else if (animal is Cow) {
            println("I see you have milk today!")
        }

        animal.speak()
    }
}

fun main() {
    val sue = Farmer("Cloy")

    val animals: List<FarmAnimal> = listOf(
        Chicken("Milu", 8), // 8 eggs
        Pig("Spider Pig"),
        Cow("Mimoza"),
    )

    animals.forEach { sue.greet(it) }
}