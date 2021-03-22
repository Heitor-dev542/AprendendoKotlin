package one.digitalinovation.collections

fun main() {
    val jo = Funcionario("Joao", 1500.0, "masculino")
    val pe = Funcionario("Pedro", 3000.0, "masculino")
    val ma = Funcionario("Maria", 1300.0, "feminino")

    println("------------------\n" +
            "Criando a lista mutavel")
    val funcionarios = mutableListOf(jo, ma)
    funcionarios.forEach {println(it)}

    println("------------------\n" +
            "Adicionando a lista mutavel")

    funcionarios.add(pe) //adicionando o novo funcionario (pe) a base funcionarios
    funcionarios.forEach {println(it)}

    println("------------------\n" +
            "Removendo da lista mutavel")

    funcionarios.remove(ma)
    funcionarios.forEach {println(it)}

    println("------------------\n" +
            "Criando o SET mutavel")

    val funcionariosSetM = mutableSetOf(pe)
    funcionariosSetM.forEach {println(it)}

    println("------------------\n" +
            "Adicionando ao SET mutavel")

    funcionariosSetM.add(jo)
    funcionariosSetM.add(ma)
    funcionariosSetM.forEach {println(it)}

    println("------------------\n" +
            "Removendo do SET mutavel")

    funcionariosSetM.remove(pe)
    funcionariosSetM.forEach {println(it)}


}