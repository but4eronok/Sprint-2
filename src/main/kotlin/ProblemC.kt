class ProblemC {

    fun main() {
        val numberOfStudents = readInt()
        val studentsSkills: IntArray = readIntArray(numberOfStudents)
        var numberOfTasks = 0

        studentsSkills.sort()

        // Сравнивамем способности студентов внутри массива и вычисляем минимальное число заданий
        // необходимых для создания команд
        for (i in numberOfStudents - 1 downTo 0 step 2) {
            numberOfTasks += studentsSkills[i] - studentsSkills[i - 1]
        }
        print(numberOfTasks)
    }
}
