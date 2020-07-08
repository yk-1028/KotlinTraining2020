package kt.strategy

class Player(private val name: String, private val strategy: Strategy) {
    private var winCount: Int = 0
    private var loseCount: Int = 0
    private var gameCount: Int = 0

    fun nextHand(): Hand {
        return this.strategy.nextHand()
    }

    fun win() {
        this.strategy.study(true)
        winCount++
        gameCount++
    }

    fun lose() {
        this.strategy.study(false)
        loseCount++
        gameCount++
    }

    fun even() {
        gameCount++
    }

    override fun toString(): String {
        return "[$name:$gameCount games, $winCount win, $loseCount lose]"
    }
}