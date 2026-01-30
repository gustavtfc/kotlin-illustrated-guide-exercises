//Statement Scopes

//val pi = 3.14

//class Circle(val radius: Double) {
  //  fun circumference(): Double {
    //    fun diameter() = radius * 2

      //  val result = pi * diameter()
      //  return result
   // }
//}

//fun main() {

  //  val myCircle = Circle(8.7)

    //val total = myCircle.circumference()

    //println(total)
//}

//Nested Scopes and Visibility

val pi = 3.14
fun main() {
    val radii = listOf(3.0, 6.0, 9.0)
    class Circle(
        val radius: Double
    ) {
        fun circumference(): Double {
            val multiplier = 2.0
            val diameter = radius * multiplier
            return multiplier * pi * radius
        }
        val area = pi * radius * radius
    }
    val areas = radii.map {
        Circle(it).area
    }
    println(areas)
}