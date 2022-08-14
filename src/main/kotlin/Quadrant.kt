fun main() {
    input {
        val x = it.toInt()
        val y = readLine()!!.toInt()
        val left = x < 0
        val top = y > 0
        when {
            !left && top -> println(1)
            left && top -> println(2)
            left && !top -> println(3)
            !left && !top -> println(4)
        }
    }
}

