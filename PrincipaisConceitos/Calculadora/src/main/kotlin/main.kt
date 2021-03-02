
fun main() {
    //Definindo as funções
    fun calcular(a: Float, b: Float, operacao: (Float, Float) -> Float): Float {
        return operacao(a, b)
    }
    fun soma(a:Float, b:Float)=a+b
    fun sub(a:Float, b:Float)=a-b
    fun mult(a:Float, b:Float)=a*b
    fun div(a:Float, b:Float)=a/b
    fun fact(a:Int):Int {
        var resultado =1
        for (i in a downTo 1)
            resultado *= i
        return resultado
    }
    //Defifindo a operação
     println("Qual operação deseja realizar?")
     println("Digite o número da operação:\n" +
             "1 - SOMA\n" +
             "2 - SUBTRACAO\n" +
             "3 - MULTIPLICACAO\n" +
             "4 - DIVISAO\n" +
             "5 - FATORIAL")
    val operacao:String? = readLine()

    if (operacao == null) {println("Digite um valor entre 1 e 5")}
    if (operacao?.toInt() !in (1..5)) {println("Digite um valor entre 1 e 5")}
    if (operacao?.toInt() in (1..4)) {

            //inserção de valores

            println("Digite o valor do primeiro número: ")
            val numA = readLine()
            println("Digite o valor do segundo número: ")
            val numB = readLine()

            // teste para pedir valores não nulos

            if (numA == null) {
                println("Insira valor não nulo para primeiro número")
            }
            if (numB == null) {
                println("Insira valor não nulo para segundo número")
            }

            //Conversao dos valores para Float

            val num1: Float = numA!!.toFloat()
            val num2: Float = numB!!.toFloat()

            //Execudando a operação

            if (operacao?.toInt() == 1) {
                println(calcular(num1, num2, ::soma))
            }
            if (operacao?.toInt() == 2) {
                println(calcular(num1, num2, ::sub))
            }
            if (operacao?.toInt() == 3) {
                println(calcular(num1, num2, ::mult))
            }
            if (operacao?.toInt() == 4) {
                println(calcular(num1, num2, ::div))
            }
        }
        if (operacao?.toInt() == 5) {
            println("Digite o número em que será aplicado a operação Fatorial: ")
            val fatNum = readLine()
            println(fact(fatNum!!.toInt()))
        }

}


