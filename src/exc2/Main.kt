package exc2

fun main() {
    val item = ItemVenda()
    val servico = Servico()
    val registro = RegistroRecebimentos()

    item.itemVenda("Celular", 5, 1000.0)

    servico.servico("Conserto de Tela", 2, 100.0)

    registro.adicionarRecebimento(item, servico)
    registro.apresentarRecebimentos()
}