package fundamentos

fun main() {
    var pessoa : Pessoa? = Pessoa("Gustavo", 24)
    println(pessoa!!.nome)
}