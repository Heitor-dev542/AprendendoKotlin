package one.digitalinovation.collections

fun main() {
    val salarios2 = doubleArrayOf(1230.0, 1400.0, 3250.0, 2100.0, 600.0, 1400.0, 5000.0)

    for (sal in salarios2) {println(sal)}

    println("----------")

    println("Maior salário: ${salarios2.maxOrNull()}")
    println("Menor salário: ${salarios2.minOrNull()}")
    println("Média salarial: ${salarios2.average()}")

    println("----------")

    val salarios2MaiorQdoimil = salarios2.filter { it > 2000.0 }

    salarios2MaiorQdoimil.forEach {
        println(it)
    }

    println("----------")

    println(salarios2.count())
    println(salarios2.count{it in 2000.0..3300.0})

    println("----------")

    println(salarios2.find { it == 1230.0 })
    println(salarios2.find { it == 123.0 })
    println(salarios2.any { it == 1230.0 })
    println(salarios2.any { it == 123.0 })


}