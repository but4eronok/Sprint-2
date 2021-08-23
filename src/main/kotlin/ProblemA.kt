class ProblemA {
    fun main() {
        var request = readInt()
        while (request-- > 0) {
            var parameters: List<Long> = readListLong()
            var rightJump = parameters[0]
            var leftJump = parameters[1]
            var jumps = parameters[2]

            // Считаем колличество прыжков
            var result = rightJump * (jumps / 2 + jumps % 2) - leftJump * (jumps / 2)

            println(result)
        }
    }
}