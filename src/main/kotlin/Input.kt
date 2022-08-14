fun input(lambda: (line: String) -> Unit) {
    var s = readLine()
    while (s != null) {
        lambda(s)
        s = readLine()
    }
}