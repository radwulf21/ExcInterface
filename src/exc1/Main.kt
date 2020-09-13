package exc1

fun main() {
    val foto = Foto("Eu sou uma selfie", "png")
    val doc = Documento("Eu sou um documento word", "docx")
    val contrato = Contrato("Sou um contrato muito legal", "pdf")

    val impressora = Impressora()

    impressora.adicionarImprimivel(foto, doc, contrato)
    impressora.imprimirLista()
}