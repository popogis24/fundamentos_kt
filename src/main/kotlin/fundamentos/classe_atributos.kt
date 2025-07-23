package fundamentos

class Carro(var cor: String, val anoFabricacao: Int, var dono: Dono) {
}

class Dono(var nome: String, var idade: Int) {

}

fun main() {
    var dono = Dono("eduardo", 12)
    val carro = Carro("Branco", 2012, dono = dono)
    println(carro.cor)
    println(carro.anoFabricacao)
    carro.cor = "Azul"
    println(carro.cor)
    println(carro.dono.nome)
    carro.dono.nome = "Daniel"
    println(carro.dono.nome)
}