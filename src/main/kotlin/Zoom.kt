fun main() {
    input {
        val (length, k) = it.split(' ').map { it.toInt() }
        val nums = readLine()!!.split(' ').map { it.toInt() }.filterIndexed { index, i -> (index + 1) % k == 0 }
        println(nums.joinToString(" "))
    }
}

