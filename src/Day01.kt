import kotlin.math.abs

fun main() {
    fun totalDistance(list1: List<Int>, list2: List<Int>): Int {
        return list1.sorted().zip(list2.sorted()).map { (item1, item2) ->
            abs(item1 - item2)
                .also { println("$item1 $item2 $it") }
        }.sum()
    }

    // Test if implementation meets criteria from the description, like:

    // Or read a large test input from the `src/Day01_test.txt` file:
//    val testInput = readInput("Day01_test")
//    check(part1(testInput) == 1)

    // Read the input from the `src/Day01.txt` file.
    totalDistance(
        list1 = listOf(3, 4, 2, 1, 3, 3),
        list2 = listOf(4, 3, 5, 3, 9, 3)
    ).also {
        println(it)
        check(it == 11)
    }
}
