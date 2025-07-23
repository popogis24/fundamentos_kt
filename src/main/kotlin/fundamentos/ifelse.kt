package fundamentos

fun main() {
    val aluno_ativo = Aluno("eduardo", 12, 6.0)
    verificarNota(aluno_ativo)
}

fun parOuImpar(numero: Int): Int {
    val resto = numero % 2

    println(resto)
    if(resto == 0) {
        println("Par")
    } else {
        println("Impar")
    }
    return resto
}

class Aluno(
    val nome:String,
    var idade:Int,
    var resultado_prova: Double){
}

fun verificarNota(aluno: Aluno): String {
    var string_final = "O aluno ${aluno.nome} tirou nota ${aluno.resultado_prova} e ${resultadoNota(aluno.resultado_prova)} "
    println(string_final)
    return string_final
}


fun resultadoNota(nota:Double):String {
    //se a nota for > 6, passou, 4 rec, menor repr
    if(nota>=6){
        return "Passou"
    }else if(nota>=4){
        return "Está em Recuperacao"
    } else {
        return "Reprovou"
    }
}