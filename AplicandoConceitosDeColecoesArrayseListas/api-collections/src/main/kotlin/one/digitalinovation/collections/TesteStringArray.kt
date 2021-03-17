package one.digitalinovation.collections

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Zeca"
    nomes[2] = "Eduardo"

    for (nome in nomes) {
        println(nome)
    }

    println("----")

    nomes.sort()
    nomes.forEach {
        println(it)
    }

    println("----")

    // Outra maneira seria usar o arrayOf

    val nomes2 = arrayOf("João", "Vitoria", "Kátia")
    nomes2.sort()
    nomes2.forEach {
        println(it)
    }
}