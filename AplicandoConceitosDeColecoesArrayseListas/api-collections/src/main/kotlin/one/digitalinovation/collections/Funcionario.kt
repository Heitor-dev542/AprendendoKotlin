package one.digitalinovation.collections

data class Funcionario(
    val nome: String,
    val salario: Double,
    val genero : String
) {
    override fun toString(): String =
        """
        Nome:    $nome
        Salario: $salario
    """.trimIndent()
}
