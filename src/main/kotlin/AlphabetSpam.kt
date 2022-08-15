import java.math.BigDecimal
import java.math.MathContext

fun main() {
    var line = readLine()
    while (line != null) {
        spam(line)
        line = readLine()
    }
}

fun spam(s: String) {
    val whitespaceCount = s.count { it == '_' }
    val lowerCaseCount = s.count { it.isLowerCase() }
    val upperCaseCount = s.count { it.isUpperCase() }
    val symbolCount = s.length - whitespaceCount - lowerCaseCount - upperCaseCount

    fun ratio(count: Int): Double = count.toDouble() / s.length
    val whitespaceRatio = ratio(whitespaceCount)
    val lowerCaseRatio = ratio(lowerCaseCount)
    val upperCaseRatio = ratio(upperCaseCount)
    val symbolRatio = ratio(symbolCount)

    fun print(ratio: Double) = println(BigDecimal(ratio, MathContext(15)))
    print(whitespaceRatio)
    print(lowerCaseRatio)
    print(upperCaseRatio)
    print(symbolRatio)
}