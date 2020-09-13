package exc1

class Impressora {
    var listaImprimivel = mutableListOf<Imprimivel>()

    fun adicionarImprimivel(vararg imprimiveis: Imprimivel) {
        listaImprimivel.addAll(imprimiveis)
    }

    fun imprimirLista() {
        for (imprimivel in this.listaImprimivel) {
            imprimivel.imprimir()
        }
    }
}