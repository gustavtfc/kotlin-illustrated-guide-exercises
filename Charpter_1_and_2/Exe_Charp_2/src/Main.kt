import com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time
import java.awt.geom.Point2D.distance

fun main() {
    var radius = 7.2

    val pi = 3.14
    fun circumference(radius: Double) = 2 * pi * radius
    val circumferenceOfSmallCircle = circumference(5.2)
    val circumferenceOfMediumCircle = circumference(6.7)
    val circumferenceOfLargeCircle = circumference(10.0)



    println("The value of circumference is: " + circumferenceOfSmallCircle)
    println("The value of circumference is: " + circumferenceOfMediumCircle)
    println("The value of circumference is: " + circumferenceOfLargeCircle)

    //calculate the average speed of a car that has traveled 321.8 kilometers in 4.15 hours.
    //fun speed(distance: Double, time: Double) = distance / time
    //val averageSpeed = speed(321.8, 4.15)

    //Functions with More Than One Parameter
    //fun speed(distance: Double, time: Double) = distance / time

    //val averageSpeed1 = speed(321.8, 4.15)
    //val averageSpeed2 = speed(distance = 321.8, 4.15)
    //val averageSpeed3 = speed(321.8, time = 4.15)
    //val averageSpeed4 = speed(distance = 321.8, time = 4.15)
    //val averageSpeed5 = speed(time = 4.15, distance = 321.8)

    //println("Speed is: " + averageSpeed)
    //println("Speed is: " + averageSpeed1)
    //println("Speed is: " + averageSpeed2)
    //println("Speed is: " + averageSpeed3)
    //println("Speed is: " + averageSpeed4)
    //println("Speed is: " + averageSpeed5)

    //Default Arguments

    //fun speed(distance: Double, time: Double = 2.0) = distance / time
    //val walkingSpeed = speed(10.2)
    //val bikingSpeed = speed(29.6)
    //val drivingSpeed = speed(225.3)
    //val flyingSpeed = speed(1368.747, 1.5)

    //println("Speed is: " + flyingSpeed)
    //println("Speed is: " + walkingSpeed)
    //println("Speed is: " + bikingSpeed)
    //println("Speed is: " + drivingSpeed)

    //When a Default Argument Comes First

    //fun speed(distance: Double = 42.195, time: Double) = distance / time
    //val walkingSpeed = speed(time = 8.27)
    //val bikingSpeed = speed(time = 2.85)
    //val drivingSpeed = speed(time = 0.37)
    //val flyingSpeed = speed(0.12, 0.01)


    //println("Speed is: " + walkingSpeed)
    //println("Speed is: " + flyingSpeed)
    //println("Speed is: " + drivingSpeed)
    //println("Speed is: " + bikingSpeed)


    //*Functions without a Result*

    var counter = 0
    fun increment() {
        counter = counter + 1
    }

}