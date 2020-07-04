package kt.observer

import java.util.*

class RandomNumberGenerator: NumberGenerator() {
    private val random = Random()
    private var number: Int = 0
    override fun getNumber(): Int {
        return number
    }

    override fun execute() {
        for (i in 1..20) {
            number = random.nextInt(50)
            notifyObservers()
        }
    }
}