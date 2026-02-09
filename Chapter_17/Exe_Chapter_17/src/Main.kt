//Exceptions

//val ordinals = listOf("zeroth", "first", "second", "third", "fourth", "fifth")

//fun ordinal(number: Int) = ordinals[number]

//fun annc(number: Int, task: String): String {
  //  val ordinal = ordinal(number)
    //return "The $ordinal thing I will do is $task."
//}

//fun main() {
  //  val first = annc(9, "clean my room")

    //println(first)
//}

//Handling Multiple Exception Types Differently

class HolidayException(val task: String) : Exception()

val ordinals = listOf("zeroth", "first", "second", "third", "fourth", "fifth")

fun annc(number: Int, task: String): String {
    if (task == "work") {
        throw HolidayException(task)
    }

    val ordinal = ordinals[number]
    return "The $ordinal thing I will do is $task."
}

fun main() {
    val number = 1
    val task = "work"

    try {
        println(annc(number, task))
    } catch (e: HolidayException) {
        println("It's a holiday! I'm not going to ${e.task} today!")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("I can't count that high!")
    } catch (e: Exception) {
        println("I wasn't expecting this!")
    }
}