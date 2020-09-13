package exc2

class ItemVenda : Recebivel {
    private var produto = ""
    private var quantidade = 0
    private var valor = 0.0

    fun itemVenda(produto: String, quantidade: Int, valor: Double) {
        this.produto = produto
        this.quantidade = quantidade
        this.valor = valor
    }

    override fun totalizarReceita(): Double {
        return this.quantidade * this.valor
    }

    override fun toString(): String {
        return "----------\nProduto: ${this.produto}\nQuantidade: ${this.quantidade}\nValor: ${this.valor}\nReceita total: R$ ${this.totalizarReceita()}"
    }
}