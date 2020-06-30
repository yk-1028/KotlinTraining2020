package kt.observer

class GraphObserver: Observer {
    override fun update(generator: NumberGenerator) {
        println("${javaClass.simpleName}:")
        val count = generator.getNumber()
        for(i in 1..count) {
            println('*')
        }
        println("")
        try {
            Thread.sleep(100)
        } catch (e: InterruptedException) {
        }
    }
}
