package pt.ipg.trabalhopa

import android.content.ContentValues

class Services(
    var nome : String,
    var data: Long,
    var carroId: Long,
    var id: Long = -1
) {
    fun toContentValues() : ContentValues {
        val valores = ContentValues()

        valores.put(TabelaServices.CAMPO_NOME,nome)
        valores.put(TabelaServices.CAMPO_DATA,data)
        valores.put(TabelaServices.CAMPO_CARRO_ID,carroId)

        return valores
    }
}