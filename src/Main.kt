fun main() {
    fib()
}

fun fib() {
    println("Введите целое число больше 0")
    var n = readln().toIntOrNull()
    var i = 1
    var f1 = 0
    var f2 = 1

    if (n != null && 0 < n)  {
        while (i < n) {
            val sum = f1 + f2
            f1 = f2
            f2 = sum
            i++
        }
        println(f2)
    } else {
        println("Ошибка ввода")
        fib()
    }
}
//F(2) = F(2-1) + F(2-2)

