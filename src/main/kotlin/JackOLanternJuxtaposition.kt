fun main() {
    var s = readLine()
    while (s != null) {
        val nums = s.split(' ').map { it.toInt() }
        println(nums.reduce(Int::times))
        s = readLine()
    }
}