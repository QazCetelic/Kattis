fun main() {
    input {
        val length = it.length / 3
        val words = it.chunked(length)
        val word = words.groupBy { it }.toList().sortedBy { it.second.size }.last().first
        println(word)
    }
}

