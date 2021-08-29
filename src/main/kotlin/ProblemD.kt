class ProblemD {
    fun main() {
        var request = readInt()

        while (request-- > 0) {
            val clients = readInt()
            val coins: List<Long> = readListLong().sorted()
            var clientsWWithMoney = 0

            // Находим оптимальную стоимость одного гамбургера
            val priceOfBurger = coins.find { it >= coins.sum() / clients }!!

            // Находим колличество клиентов, способных заплатить за бургер и суммируем их
            for (i in coins) {
                if (i >= priceOfBurger)
                    clientsWWithMoney++
            }

            println(clientsWWithMoney * priceOfBurger)
        }
    }
}