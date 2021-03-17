package one.digitalinovation.collections

/*
usar IntArrayOf quando criar uma array sem capacidade definida a priori. Pode ser alterada apenas ao
adicionar novos valores
 */
fun main() {
    val valoresOf = intArrayOf(5,3,4,8,1)

    valoresOf.forEach {
        println(it)
    }
    println("-----")
    valoresOf.sort()
    valoresOf.forEach {
        println(it)
    }
}