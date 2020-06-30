package kt.observer

class DigitObserver: Observer {
    override fun update(generator: NumberGenerator) {
        println("${javaClass.simpleName}:${generator.getNumber()}")
        try {
            Thread.sleep(100)
        } catch (e: InterruptedException) {
        }
    }
}
