class Calculos {
    fun forcaPeso(massa: Float, gravidade: Float): Float {
        return massa * gravidade
    }

    fun forcaCentripeta(massa: Float, velocidade: Float, raio: Float): Float {
        return massa * (velocidade / raio)
    }

    fun impulso(forcaMedia: Float, tempoInicial: Byte, tempoFinal: Byte): Float{
        return forcaMedia * (tempoFinal - tempoInicial)
    }

    fun forcaElastica(constanteElastica: Float, deformacao: Float): Float{
        return constanteElastica * deformacao
    }

    fun velocidadeMedia(posicaoInicial: Float, posicaoFinal: Float, tempoInicial: Byte, tempoFinal: Byte): Float{
        return (posicaoFinal - posicaoInicial) / (tempoFinal - tempoInicial)
    }

    fun mru(posicaoInicial: Float, velocidade: Float, tempo: Byte): Float{
        return posicaoInicial + (velocidade * tempo)
    }

    fun mruv(velocidadeInicial: Float, aceleracao: Float, tempo: Byte): Float{
        return velocidadeInicial + (aceleracao * tempo)
    }
}