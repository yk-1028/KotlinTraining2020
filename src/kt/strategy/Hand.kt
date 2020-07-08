package kt.strategy

class Hand(private val handValue: HandValue) {
    fun isStrongerThan(h: Hand): Boolean {
        return fight(h) == 1
    }
    fun isWeakerThan(h: Hand): Boolean {
        return fight(h) == -1
    }
    private fun fight(h: Hand): Int {
        return when {
            this == h -> 0 //引き分け
            (this.handValue.value + 1) % 3 == h.handValue.value -> 1 //thisの勝ち
            else -> -1 //thisの負け
        }
    }

    override fun toString(): String {
        return this.handValue.valueName
    }

    companion object {
        enum class HandValue(val value: Int, val valueName: String) {
            GUU(0, "グー"),
            CHO(1, "チョキ"),
            PAA(2, "パー");

            companion object {
                fun parseFromValue(value: Int): HandValue? {
                    return HandValue.values().firstOrNull {it.value == value}
                }
            }
        }

        fun getHand(value: Int): Hand {
            return Hand(HandValue.parseFromValue(value)!!)
        }
    }
}