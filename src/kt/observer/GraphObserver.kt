package kt.observer

class GraphObserver: Observer {
    override fun update(generator: NumberGenerator) {
        println("${javaClass.simpleName}:")
        val count = generator.getNumber()
        val sb = StringBuilder()
        for(i in 1..count) {
            //kotlinだと勝手に改行が入る
//            println('*')
            sb.append('*')
        }
//        println("")
        println(sb.toString())
        try {
            Thread.sleep(100)
        } catch (e: InterruptedException) {
        }
    }
}
