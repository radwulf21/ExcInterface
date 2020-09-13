package exc1

class Contrato(override var nome: String, override var tipoDocumento: String) : Imprimivel {
    override fun imprimir() {
        println("${this.nome}.${this.tipoDocumento}")
    }
}