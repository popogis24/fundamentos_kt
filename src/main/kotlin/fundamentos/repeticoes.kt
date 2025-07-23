package fundamentos

fun main() {
print1a10()
print10a1()
printRange(50,60)
}

fun print1a10() {
    for(numero in 1 .. 10) {
        if(numero % 2 ==1){
            println(numero)
        }
    }
}


fun print10a1() {
    for(numero in 10 downTo 1) {
        println(numero)
    }
}

fun printRange(inicio:Int, fim:Int){
    for(numero in inicio .. fim){
        println(numero)
    }
}