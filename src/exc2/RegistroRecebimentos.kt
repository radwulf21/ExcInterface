package exc2

class RegistroRecebimentos {
    var registroRecebimentos = mutableListOf<Recebivel>()

    fun adicionarRecebimento(vararg r: Recebivel) {
        this.registroRecebimentos.addAll(r)
    }

    fun apresentarRecebimentos() {
        for (recebivel in this.registroRecebimentos) {
            println(recebivel.toString())
        }
    }
}