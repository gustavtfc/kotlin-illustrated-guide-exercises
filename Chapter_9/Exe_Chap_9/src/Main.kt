//Creating a Map with mapOf()

//fun main() {
    //val toolbox = mutableMapOf(
        //"Nail" to "Hammer",
        //"Hex Nut" to "Wrench",
        //"Hex Bolt" to "Wrench",
       // "Slotted Screw" to "Slotted Screwdriver",
      //  "Phillips Screw" to "Phillips Screwdriver",
    //)

    //toolbox.put("Lumber", "Saw")
    //toolbox["Hex Bolt"] = "Nut Driver"
    //toolbox.remove("Lumber")
  //  println(toolbox)// Nail
//}


//Immutable Maps plus and minus e.g.
//fun main() {
  //  var toolbox = mapOf(
    //    "Nail" to "Hammer",
      //  "Hex Nut" to "Wrench",
       //"Hex Bolt" to "Wrench",
       // "Slotted Screw" to "Slotted Screwdriver",
       // "Phillips Screw" to "Phillips Screwdriver",
   // )

// Add an entry
   // toolbox = toolbox + Pair("Lumber", "Saw")
// Update an entry
   // toolbox = toolbox + Pair("Hex Bolt", "Nut Driver")
// Remove an entry
    //toolbox = toolbox - "Lumber"
// Simulate changing a key
    //toolbox = toolbox - "Phillips Screw"
    //toolbox = toolbox + Pair("Cross Recess Screw", "Phillips Screwdriver")

    //toolbox.forEach { entry ->
     //   println("Use a ${entry.value} on a ${entry.key}")
    //}
//}

//Associating Properties from a List of Objects

fun main() {
    data class Tool(
        val name: String,
        val weightInOunces: Int,
        val correspondingHardware: String,
    )

    val tools = listOf(
        Tool("Hammer", 14, "Nail"),
        Tool("Wrench", 8, "Hex Nut"),
        Tool("Wrench", 8, "Hex Bolt"),
        Tool("Slotted Screwdriver", 5, "Slotted Screw"),
        Tool("Phillips Screwdriver", 5, "Phillips Screw"),
    )

        tools.forEach { tool ->
        println("${tool.name}, ${tool.weightInOunces}, ${tool.correspondingHardware}")
    }
}