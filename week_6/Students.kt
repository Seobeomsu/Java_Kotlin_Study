package week_6

data class Student(val name: String, val score: Int)

fun main() {
    val students: List<Student> =
        listOf(Student("범수", 70), Student("태영", 90), Student("채영", 50), Student("진희", 80), Student("가은", 60))

    // 80점 이상 출력
    println(students.filter { it.score >= 80 })

    println(students)
    val sortedStudents = students.sortedByDescending(Student::score)
    println(sortedStudents)

    val newScore = sortedStudents.map{it.score +5 }
    println(newScore)
}