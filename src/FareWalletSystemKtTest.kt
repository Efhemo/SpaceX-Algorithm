import kotlin.test.assertEquals

class FareWalletSystemKtTest {

    @org.junit.Test
    fun trip() {

        assertEquals(2900, trip(3000, "Abuja", "Moon", "falcon 9"))

        assertEquals(2750, trip(3000, "Moon", "Spock", "falcon 1"))

        assertEquals(2300, trip(3000, "Spock", "ISS", "falcon 9"))
    }
}