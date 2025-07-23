package fundamentos

class MinhaClasse(var nome: String, var idade: Int, var endereco: String) {
    companion object {
        fun criaClasse(): MinhaClasse {
            return MinhaClasse(nome = "Classe de Exemplo", idade = 30, endereco = "Rua Exemplo")
        }
    }
}

class SegundaClasse(var nome: String, idade: Int, endereco: String) {
    fun criaClasse(): SegundaClasse {
        return SegundaClasse()
    }
}

fun main() {
    // Usando o companion object
    val instancia1 = MinhaClasse.criaClasse()
    println("Instância 1: $instancia1")

    // Usando a função de instância
    val instancia2 = SegundaClasse("Miguel", 18, "rua azul").criaClasse()
    println("Instância 2: $instancia2")
}