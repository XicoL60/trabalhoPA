package pt.ipg.trabalhopa

import android.content.ContentValues

data class Carros(
    var marca : String,
    var modelo: String,
    var matricula: Long,
    var ano: Long,
    var clienteId: Long,
    var serviçoId: Long,
    var id: Long = -1
) {
    fun toContentValues() : ContentValues {
        val valores = ContentValues()

        valores.put(TabelaCarros.CAMPO_MARCA,marca )
        valores.put(TabelaCarros.CAMPO_MODELO,modelo)
        valores.put(TabelaCarros.CAMPO_MATRICULA,matricula )
        valores.put(TabelaCarros.CAMPO_ANO,ano )
        valores.put(TabelaCarros.CAMPO_CLIENTE_ID,clienteId )
        valores.put(TabelaCarros.CAMPO_SERVIÇO_ID,serviçoId )

        return valores
    }
}