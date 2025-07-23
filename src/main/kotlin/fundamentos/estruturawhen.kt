package fundamentos

fun main() {
    val x = 5

    when(x) {
        5 -> println("x é igual a 5")
        10 -> println("x é igual a 10")
        else -> println("x não é igual a 5 nem a 10")
    }
    when (x) {
        in 11..15 -> println("x está entre 11 e 15")
        in 1..10 -> println("x está entre 1 e 10")
        else -> println("x não está entre 1 e 15")
    }
    println(comecaComOi("Oi, tudo bem?")) // true
    comecaComOi("Olá, tudo bem?") // false
}

fun comecaComOi(texto: String): Boolean {
    return when(texto) {
        is String -> texto.startsWith("Oi")
        else -> false
    }
}