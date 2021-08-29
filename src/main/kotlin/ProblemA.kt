class ProblemA {
    fun main() {
        var request = readInt()
        while (request-- > 0) {
            val parameters: List<Long> = readListLong()
            val rightJump = parameters[0]
            val leftJump = parameters[1]
            val jumps = parameters[2]

            // Считаем колличество прыжков
            val result = rightJump * (jumps / 2 + jumps % 2) - leftJump * (jumps / 2)

            println(result)
        }
    }
}