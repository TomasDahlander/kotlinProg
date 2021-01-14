package InlämningsuppgiftDel1

class Question(q1: String, a1: String, a2: String, a3: String, a4: String, cat: Category, correct: Int) {
    val question = q1
        get() {
            return field
        }
    val category = cat
        get() {
            return field
        }
    val answers = listOf(a1,a2,a3,a4)
        get() {
            return field
        }
    val correctAnswer = correct
        get() {
            return field
        }
}