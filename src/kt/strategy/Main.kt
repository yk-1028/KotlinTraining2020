package kt.strategy

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val dummyArgs = listOf("314", "15")
//    if(args.size != 2) {
//        println(args.size)
//        exitProcess(0)
//    }

    val player1 = Player("Taro", WinningStrategy(Integer.parseInt(dummyArgs[0])))
    val player2 = Player("Hana", ProbStrategy(Integer.parseInt(dummyArgs[1])))

    for (i in 1..10000) {
        val nextHand1 = player1.nextHand()
        val nextHand2 = player2.nextHand()

        when {
            nextHand1.isStrongerThan(nextHand2) -> {
                println("Winner:$player1")
                player1.win()
                player2.lose()
            }
            nextHand2.isStrongerThan(nextHand1) -> {
                println("Winner:$player2")
                player1.lose()
                player2.win()
            }
            else -> {
                println("Even...")
                player1.even()
                player2.even()
            }
        }

        println("Total result:")
        println(player1.toString())
        println(player2.toString())
    }
}