//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//fun main() {
//List add or remove element

    //var booksToRead: List<String> = listOf(
      //  "Tea with Agatha",
       // "Mystery on First Avenue",
       // "The Ravine of Sorrows",
       // "Among the Aliens",
        //"The Kingsford Manor Mystery",
   // )

    //booksToRead = booksToRead + "Beeyond the Expanse"
    //val newBooksToRead = booksToRead + "Beyond the Expanse" - "The Kingsford Manor Mystery"

    //println(booksToRead)
  //  println(newBooksToRead)
//}

//List and MutableList
//fun main() {
//var booksToRead: MutableList<String> = mutableListOf(
  //  "Tea with Agatha",
   // "Mystery on First Avenue",
   // "The Ravine of Sorrows",
   // "Among the Aliens",
   // "The Kingsford Manor Mystery",
//)
//booksToRead.add("Beyond the Expanse")
//booksToRead.remove("Among the Aliens")



  //  println(booksToRead)
//}

//Mapping Collections: Converting Elements

//fun main() {

  //  var booksToRead: MutableList<String> = mutableListOf(
    //    "Tea with Agatha",
        //"Mystery on First Avenue",
      //  "The Ravine of Sorrows",
      //  "Among the Aliens",
      //  "The Kingsford Manor Mystery",
   // )


   // val sortableTitles = booksToRead.map { title ->
     //   title.removePrefix("The ")
   // }

    //println("Original: $booksToRead")
    //println("Formatted: $sortableTitles")
//}

//Filtering Collections: Including and Omitting Elements

fun main() {

    var booksToRead: MutableList<String> = mutableListOf(
        "Tea with Agatha",
        "Mystery on First Avenue",
        "The Ravine of Sorrows",
        "Among the Aliens",
        "The Kingsford Manor Mystery",
    )


    val booksForNolan = booksToRead
        .map { title -> title.removePrefix("The ")    }
        .sorted()
        .filter { title -> title.contains("Mystery") }
    println("Original: $booksToRead")
    println("For friend Nolan: $booksForNolan")
}