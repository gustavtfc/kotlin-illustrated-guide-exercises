//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //An Empty Class

    //class Circle

    //fun drawCircle(circle: Circle) {
        //Codethat draw the circle would go here
    //}

    //Getting a Property’s Value
    //class Circle(var radius: Double) {
      //  val pi: Double = 3.14
    //}

    //val smallCircle = Circle(5.2)
    //val mediumCircle = Circle(6.7)
    //val largeCircle = Circle(10.0)
   // val radiusOfSmallCircle: Double = smallCircle.radius

    //Adding a Member Function
    class Circle (var radius: Double) {
        private val pi: Double = 3.14

        fun circumference() = 2 * pi * radius

    }

    val circle = Circle(11.0)
    //println(radiusOfSmallCircle)
    //println(largeCircle.pi + largeCircle.radius)
    println(circle.radius)
    println(circle.circumference())
    println(circle.circumference() + circle.radius)

}