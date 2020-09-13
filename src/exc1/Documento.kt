package exc1

class Documento(override var nome: String, override var tipoDocumento: String) : Imprimivel {
    override fun imprimir() {
        println("${this.nome}.${this.tipoDocumento}")
    }
}