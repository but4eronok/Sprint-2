class ProblemB {

    fun main() {
        var request = readInt()
        while (request-- > 0) {
            var parameters: List<Int> = readListInt()
            var stringLength = parameters[0]
            var charactersNumber = parameters[1]
            var maximumFrequency = stringLength / charactersNumber
            var resultString = ""

            // Вычисляем комбинации букв, которые будут создавать будущую строку
            for (i in 0 until charactersNumber) {

            resultString += 'a'.plus(i % charactersNumber)

            }

            // Добавляем комбинации букв до тех пор, пока строка не заполнится
            for (i in resultString.length until stringLength) {
                resultString += 'a'.plus(i % charactersNumber)
            }

            println(resultString)

        }

    }
}