//Introduction to Receivers

//class Dog {
  //  fun speak() {
     //   println("BARK!")
   // }

    //fun play() {
      //  speak()
   // }
//}

//fun main() {
    // 1. Dog object
  //  val myDog = Dog()

    // 2. Call the functions
    //myDog.speak() // Prints: BARK!
//    myDog.play()  // Prints: BARK! (because play calls speak)
//}

// You must define this extension function first!

//Nullable Receiver Types
fun String.singleQuoted(): String {
    return "'$this'"
}

fun main() {
    val title: String? = null

    val newTitle = title?.singleQuoted()

    println(newTitle) // Prints: "null" or other name in val title
}