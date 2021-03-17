package one.digitalinovation.collections

fun main() {
    val valores = IntArray(5)
    valores[0]=9
    valores[1]=2
    valores[2]=8
    valores[3]=6
    valores[4]=3

    for (r in valores) {
        println(r)
    }

    println("-----")

    valores.forEach {
        println(it)
    }

    println("-----")

    for (index in valores.indices) {
        println(valores[index])
    }

    println("-----")

    for (index in valores.indices) {
        println(valores[3])
    }

    println("-----")

    valores.sort()
    for (r in valores) {
        println(r)
    }
}