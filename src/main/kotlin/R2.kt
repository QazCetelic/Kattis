fun main() {
    input { line ->
        val (r1, s) = line.split(' ').map { it.toInt() }
        println(s + (s - r1))
    }
}

