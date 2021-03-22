package one.digitalinovation.collections

fun main() {
    val funcP: Pair<String, Double> = Pair("João", 3000.5)
    val map1 = mapOf(funcP)
    map1.forEach { (k, v) -> println("Chave : $k - Valor: $v") }

    val map2 = mapOf(
        "Pedro" to 1300.0,
        "Maria" to 8000.0
    )
    map2.forEach { (k, v) -> println("Chave : $k - Valor: $v") }
}