fun main() {

    fun multiplyAndAdd(query: String): Int {
        val regex = """(mul\(\d{1,3},\d{1,3}\))""".toRegex()
        return regex.findAll(query)
            .toList()
            .map { value ->
                val digits = value.value
                    .split("""(\D)""".toRegex())
                    .filter { it.isNotEmpty() }
                    .map { it.toInt() }
                var a = 1
                digits.forEach {
                    a *= it
                }
                a
            }.sum()
    }

    val question = "xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))"

    check(multiplyAndAdd(question) == 161)

}

