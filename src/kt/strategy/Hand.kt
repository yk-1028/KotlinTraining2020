package kt.strategy

class Hand(private val handValue: Int) {
    fun isStrongerThan(h: Hand): Boolean {
        return fight(h) == 1
    }
    fun isWeakerThan(h: Hand): Boolean {
        return fight(h) == -1
    }
    private fun fight(h: Hand): Int {
        return when {
            this == h -> 0 //引き分け
            (this.handValue + 1) % 3 == h.handValue -> 1 //thisの勝ち
            else -> -1 //thisの負け
        }
    }

    override fun toString(): String {
        return name[handValue]
    }

    companion object {
        const val handValueGuu = 0
        const val handValueCho = 1
        const val handValuePaa = 2
        val hand = listOf(
                Hand(handValueGuu),
                Hand(handValueCho),
                Hand(handValuePaa))
        private val name = listOf("グー", "チョキ", "パー")

        fun getHand(handValue: Int): Hand {
            return hand[handValue]
        }
    }
}