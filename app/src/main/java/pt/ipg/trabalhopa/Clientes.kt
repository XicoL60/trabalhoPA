package pt.ipg.trabalhopa

import android.content.ContentValues

class Clientes(
    var nome : String,
    var nif: Long,
    var contacto: Long,
    var morada: String,
    var carroId: Long,
    var id: Long = -1
) {
    fun toContentValues() : ContentValues {
        val valores = ContentValues()

        valores.put(TabelaClientes.CAMPO_NOME,nome )
        valores.put(TabelaClientes.CAMPO_NIF,nif)
        valores.put(TabelaClientes.CAMPO_CONTACTO,contacto )
        valores.put(TabelaClientes.CAMPO_MORADA,morada )
        valores.put(TabelaClientes.CAMPO_CARRO_ID,carroId )

        return valores
    }
}
