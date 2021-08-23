class ProblemD {
    fun main() {
        var request = readInt()

        while (request-- > 0) {
            var clients = readInt()
            var coins: List<Long> = readListLong().sorted()
            var clientsWWithMoney = 0

            // Находим оптимальную стоимость одного гамбургера
            var priceOfBurger = coins.find { it >= coins.sum() / clients }!!

            // Находим колличество клиентов, способных заплатить за бургер и суммируем их
            for (i in coins) {
                if (i >= priceOfBurger)
                    clientsWWithMoney++
            }

            println(clientsWWithMoney * priceOfBurger)
        }
    }
}