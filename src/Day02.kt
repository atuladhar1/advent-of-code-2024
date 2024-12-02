import kotlin.math.abs

enum class Change {
    INC,
    DEC
}

fun main() {
    fun detectChange(list: List<Int>): Boolean {
        var change: Change? = null
        for (j in 0..<list.size - 1) {
            if (abs(list[j] - list[j + 1]) > 3) {
                return false
            }
            // Inc
            if (list[j] - list[j + 1] > 0) {
                if (change == null) {
                    change = Change.INC
                } else if (change == Change.DEC) {
                    return false
                }
            }
            // DEC
            else if (list[j] - list[j + 1] < 0) {
                if (change == null) {
                    change = Change.DEC
                } else if (change == Change.INC) {
                    return false
                }
            }
            // No change
            else {
                return false
            }
        }
        return true
    }

    val lists = listOf(
        listOf(7, 6, 4, 2, 1),
        listOf(1, 2, 7, 8, 9),
        listOf(9, 7, 6, 2, 1),
        listOf(1, 3, 2, 4, 5),
        listOf(8, 6, 4, 4, 1),
        listOf(1, 3, 6, 7, 9),
    )

    val sols = listOf(
        true,
        false,
        false,
        false,
        false,
        true,
    )

    lists.map { detectChange(it) }.zip(sols).map { (ans, sols) ->
        check(ans == sols)
    }
}
