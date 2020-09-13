package exc2

class Servico : Recebivel {
    private var descricao = ""
    private var horas = 0
    private var precoHora = 0.0

    fun servico(descricao: String, horas: Int, precoHora: Double) {
        this.descricao = descricao
        this.horas = horas
        this.precoHora = precoHora
    }

    override fun totalizarReceita(): Double {
        return this.horas * this.precoHora
    }

    override fun toString(): String {
        return "----------\nDescrição: ${this.descricao}\nHoras: ${this.horas}\nPreço Hora: ${this.precoHora}\nReceita total: R$ ${this.totalizarReceita()}"
    }
}