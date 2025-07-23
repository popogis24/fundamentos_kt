package fundamentos

fun main() {
    println(dizOi("teste"))
}

fun retornaNome(): String {
    return "Gustavo"
}

fun dizOi(nome: String, idade: Int = 20) {
    println("Oi ${nome}, tu tem ${idade} anos")
}