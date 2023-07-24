fun main(array: Array<String>) {
    print("Введіть перше число: ")
    val x:Int = readlnOrNull()!!.toInt()
    print("Введіть друге число: ")
    val y: Int = readlnOrNull()!!.toInt()

    println("Введіть символ операції")
    println("+ Додавання")
    println("- Віднімання")
    println("* - Множення")
    println("/ - Ділення")
    println("% - Залишок від ділення")

    val operation: Char = readlnOrNull()!!.first()

    when (operation) {
        '+' -> { println("Результат додавання: ${x+y}") }
        '-' -> { println("Результат віднімання: ${x-y}") }
        '*' -> { println("Результат множення: ${x*y}") }
        '/' -> { println("Результат ділення: ${x/y}") }
        '%' -> { println("Результат залишку від ділення: ${x%y}") }
        else -> { println("Операція з '${operation}' не підтримується")}
    }
}