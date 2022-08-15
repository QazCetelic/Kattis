fun main() {
    input {
        println(it.count { c -> listOf('A','E','I','O','U').any { v -> c.equals(v, ignoreCase = true) } })
    }
}

