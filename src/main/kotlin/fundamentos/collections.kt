package fundamentos

//fun main() {
//    var lista: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    val pares = lista.filter { it % 2 == 0 }
//    println(pares)
//
//    var lista_add: MutableList<Int> = mutableListOf()
//    lista.forEach {
//        if (it % 2 == 1) {
//            lista_add.add(it)}
//        }
//    println(lista_add)
//    for(i in lista){
//        lista_add.add(i+6)
//    }
//    print(lista_add)
//}

fun listas() {
    var lista: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var setNumeros: Set<Int> = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10)
    println(setNumeros)
    println(lista)

}

fun map() {
    var mapNome = mutableMapOf<String, Int>(
        "João" to 20,
        "Maria" to 30,
        "José" to 40
    )
    mapNome["Ana"] = 25
    println(mapNome)
}
