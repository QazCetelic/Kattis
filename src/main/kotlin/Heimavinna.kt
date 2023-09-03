fun main() {
    input {
        val parts = it.split(';')
        var count = 0
        for (part in parts) {
            if ('-' in part) {
                val (from, to) = part.split('-').map { it.toInt() }
                count += to - from + 1
            }
            else {
                count++
            }
        }
        println(count)
    }
}