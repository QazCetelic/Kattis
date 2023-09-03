fun main() {
    input {
        val (a, b) = it.split(' ').map { it.toInt() }
        println(if (a > b) 1 else 0)
    }
}

