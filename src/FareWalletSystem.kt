fun main(args: Array<String>) {

    println("Remaining Balance of:")

    println("taking the falcon 9 from Abuja to Moon station is ${trip(3000, "Abuja", "Moon", "falcon 9")}")
    println("taking the falcon 1 from Moon to Spock station ${trip(3000, "Moon", "Spock", "falcon 1")}")
    println("taking the falcon 9 from Mars to ISS station ${trip(3000, "Mars", "ISS", "falcon 9")}")
}


/**
 * This [getOrbit] function will determine the orbit of a particular location
 *
 * @param location
 * */
private fun getOrbit(location: String): String? {
    val orbit = HashMap<String, String>()
    orbit["Spock"] = "Mars"
    orbit["Abuja"] = "Earth"
    orbit["ISS"] = "Earth"
    orbit["Moon"] = "Earth"

    return orbit[location]
}

fun trip(loadWallet: Int, from: String, to: String, rocket: String): Int {

    var charges = 0
    val originOrbit = getOrbit(from)
    val destinationOrbit = getOrbit(to)

    //Journey between two	points in an orbit on Falcon	1
    if (originOrbit == destinationOrbit) {
        charges = 50
    }

    //Anytime you cross from one orbit to another on Falcon	1
    if (originOrbit != destinationOrbit) {
        charges = 250
    }

    //if he travels through falcon 9
    if (rocket == "falcon 9") {
        charges = charges.times(2)
    }

    //Royalty when landing	on man-made	stations (satellites) on any rocket
    if (to == "ISS") {
        charges = charges.plus(200)
    }

    /**
     * balance is return*/
    return loadWallet - charges
}