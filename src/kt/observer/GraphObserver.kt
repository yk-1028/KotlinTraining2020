package kt.observer

class GraphObserver: Observer {
    override fun update(generator: NumberGenerator) {
        print("${javaClass.simpleName}:")
        val count = generator.getNumber()
        for(i in 1..count) {
            //kotlinだと勝手に改行が入る
            print('*')
        }
        println("")
        try {
            Thread.sleep(100)
        } catch (e: InterruptedException) {
        }
    }
}
