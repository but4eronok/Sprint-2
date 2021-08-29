class ProblemB {

    fun main() {
        var request = readInt()
        while (request-- > 0) {
            val parameters: List<Int> = readListInt()
            val stringLength = parameters[0]
            val charactersNumber = parameters[1]
            var resultString = ""

            for (i in 0 until stringLength) {
                resultString += 'a'.plus(i % charactersNumber)
            }

            println(resultString)

        }

    }
}