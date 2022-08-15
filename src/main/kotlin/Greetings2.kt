fun main() {
    input {
        val amount = it.drop(1).dropLast(1).length
        val string = buildString {
            append(it.first())
            repeat(amount * 2) {
                append('e')
            }
            append(it.last())
        }
        println(string)
    }
}

