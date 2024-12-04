fun main() {

    fun checkXmas(para: List<String>): Int {
        var counter = 0
        for (i in para.indices) {
            for (j in 0..<para[i].length) {
                // left to right, right to left
                try {
                    val b =
                        para[i][j].toString() + para[i][j + 1].toString() + para[i][j + 2].toString() + para[i][j + 3].toString()
                    if (b == "XMAS" || b == "SAMX") {
                        counter++
                    }
                } catch (_: Exception) {
                }

                // diagonal down
                try {
                    val b =
                        para[i][j].toString() + para[i + 1][j + 1].toString() + para[i + 2][j + 2].toString() + para[i + 3][j + 3].toString()
                    if (b == "XMAS" || b == "SAMX") {
                        counter++
                    }
                } catch (_: Exception) {
                }

                // diagonal up
                try {
                    val b =
                        para[i][j].toString() + para[i - 1][j - 1].toString() + para[i - 2][j - 2].toString() + para[i - 3][j - 3].toString()
                    if (b == "XMAS" || b == "SAMX") {
                        counter++
                    }
                } catch (_: Exception) {
                }
                // left to right, right to left
                try {
                    val b =
                        para[i][j].toString() + para[i + 1][j].toString() + para[i + 2][j].toString() + para[i + 3][j].toString()
                    if (b == "XMAS" || b == "SAMX") {
                        counter++
                    }
                } catch (_: Exception) {
                }


            }
        }
        return counter
    }

    val prob = listOf(
        "MMMSXXMASM",
        "MSAMXMSMSA",
        "AMXSXMAAMM",
        "MSAMASMSMX",
        "XMASAMXAMM",
        "XXAMMXXAMA",
        "SMSMSASXSS",
        "SAXAMASAAA",
        "MAMMMXMMMM",
        "MXMXAXMASX",
    )

    check(checkXmas(prob) == 18)
}

