fun main(args: Array<String>) {
    val calculos: Calculos = Calculos()

    val resultadoForcaPeso:Float = calculos.forcaPeso(30f, 10f)
    print("O resultado da força peso é $resultadoForcaPeso")

    val resultadoForcaCentripeta: Float = calculos.forcaCentripeta(25f, 10f, 5f)
    println("O resultado da força centrípeta é $resultadoForcaCentripeta")

    val resultadoImpulso: Float = calculos.impulso(20f, 5, 2)
    println("O resultado do impulso é $resultadoImpulso")

    val resultadoForcaElastica: Float = calculos.forcaElastica(20f, 10f)
    println("O resultado da força elástica é $resultadoForcaElastica")

    val resultadoVelocidadeMedia: Float = calculos.velocidadeMedia(50f, 20f, 20, 5)
    println("O resultado da velocidade média é $resultadoVelocidadeMedia")

    val resultadoMru: Float = calculos.mru(25f, 30f, 20)
    println("O resultado do MRU é $resultadoMru")

    val resultadoMruv: Float = calculos.mruv(10f, 15f, 20)
    println("O resultado do MRUV é $resultadoMruv")
}