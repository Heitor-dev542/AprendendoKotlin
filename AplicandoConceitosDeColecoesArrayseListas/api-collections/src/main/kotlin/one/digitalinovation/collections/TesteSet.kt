package one.digitalinovation.collections

fun main() {
    val jo = Funcionario("Joao", 1500.0, "masculino")
    val pe = Funcionario("Pedro", 3000.0, "masculino")
    val ma = Funcionario("Maria", 1300.0, "feminino")

// criando dois conjuntos

    val funcionarios1 = setOf(jo, pe)
    val funcionarios2 = setOf(ma)

    println("------------------\n" +
            "Print em uniao1")
    val uniao1 = funcionarios1.union(funcionarios2)
    uniao1.forEach { println(it) }
    println("------------------\n" +
            "Print em subtração")
    val funcionarios3 = setOf(jo, pe, ma)
    val subtracao = funcionarios3.subtract(funcionarios2)
    subtracao.forEach { println(it) }
    println("------------------\n" +
            "Print em interseccao")
    val intersec = funcionarios3.intersect(funcionarios2)
    intersec.forEach { println(it) }
}