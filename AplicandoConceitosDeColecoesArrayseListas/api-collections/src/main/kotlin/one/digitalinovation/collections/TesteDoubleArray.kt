package one.digitalinovation.collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1200.0
    salarios[1] = 3000.0
    salarios[2] = 900.0

    salarios.forEachIndexed { index, salario ->
        salarios[index]= salario * 1.1
        //usado para operaçoes em cada valor da Array
    }

    salarios.forEach {
        println(it)
    }

}