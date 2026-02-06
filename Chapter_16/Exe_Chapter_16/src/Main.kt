// Chapte 16

//enum class Size { CUP, BUCKET, BAG }

//interface Request {
  //  val id: Int
//}

//class OrderRequest(override val id: Int, val size: Size) : Request
//class RefundRequest(override val id: Int, val size: Size, val reason: String) : Request
//class SupportRequest(override val id: Int, val text: String) : Request

//object FrontDesk {
  //  fun receive(request: Request) {
    //    println("Handling request #${request.id}")

      //  when (request) {
        //    is OrderRequest -> IceCubeFactory.fulfill(request)
          //  is RefundRequest -> IceCubeFactory.fulfill(request)
          //  is SupportRequest -> HelpDesk.handle(request) // Added this!
          //  else -> println("Unknown request type")
       // }
   // }
//}

//object IceCubeFactory {
  //  fun fulfill(order: OrderRequest) = println("Fulfilling order #${order.id}")
  //  fun fulfill(refund: RefundRequest) = println("Fulfilling refund #${refund.id}")
//}

//object HelpDesk {
  //  fun handle(request: SupportRequest) = println("Help desk is handling ${request.id}")
//}

//fun main () {
  //  val order = OrderRequest(123, Size.CUP)
    //FrontDesk.receive(order)

    //val request = SupportRequest(789, "I can't open the bag of ice!")
    //FrontDesk.receive(request)
//}


//Introduction to Sealed Types

enum class SchnauzerBreed { MINIATURE, STANDARD, GIANT }

// 1. DATA - Sealed Class Hierarchy
enum class Size { CUP, BUCKET, BAG }

sealed class Request {
    // Generates a random ID for every request
    val id: Int = kotlin.random.Random.nextInt(1000)
}

class OrderRequest(val size: Size) : Request()
class RefundRequest(val size: Size, val reason: String) : Request()
class SupportRequest(val text: String) : Request()


// 2. THE MANAGER - FrontDesk
object FrontDesk {
    fun receive(request: Request) {
        println("Handling request #${request.id}")

        when (request) {
            is OrderRequest -> IceCubeFactory.fulfillOrder(request)
            is RefundRequest -> IceCubeFactory.fulfillRefund(request)
            is SupportRequest -> HelpDesk.handle(request)
        }
    }
}

// 3. THE WORKERS - Factory & HelpDesk
object IceCubeFactory {
    fun fulfillOrder(order: OrderRequest) = println("Making ice (Size: ${order.size})")
    fun fulfillRefund(refund: RefundRequest) = println("Refunding ID ${refund.id} because: ${refund.reason}")
}

object HelpDesk {
    fun handle(req: SupportRequest) = println("Support ticket created: ${req.text}")
}

// 4. MAIN - Run
fun main() {
    val order = OrderRequest(Size.CUP)
    FrontDesk.receive(order)

    val support = SupportRequest("I dropped my ice!")
    FrontDesk.receive(support)
}