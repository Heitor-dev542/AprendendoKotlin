package one.digitalinovation.collections

fun main() {
    val jo = Funcionario("Joao", 1500.0, "masculino")
    val pe = Funcionario("Pedro", 3000.0, "masculino")
    val ma = Funcionario("Maria", 1300.0, "feminino")

    val funcionarios = listOf(jo, pe, ma)
    println("Lista de funcionarios e salarios:")
    funcionarios.forEach {println(it)}
    println("------------------\n" +
            "Busca de funcionario Pedro:")
    // para imprimir os dados específicos
    println(funcionarios.find { it.nome == "Pedro"})
    println("------------------\n" +
            "Exibir funcionarios com salario menor que 1300:")
    println(funcionarios.filter { it.salario >1300.0 })
    println("------------------\n" +
            "Exibir fucnionarios Joao e Maria:")
    println(funcionarios.filter { it.nome in arrayOf("Joao", "Maria") })
    println("------------------\n" +
            "Lista de funcionarios ordenada por salario:")
    // ordenar e dar print na ordenacao
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }
    println("------------------\n" +
            "Agrupar por genero")
    funcionarios
        .groupBy { it.genero }
        .forEach { println(it) }
}

