package pt.ipg.trabalhopa

import android.content.ContentValues

class Serviços(
    var nome : String,
    var data: Long,
    var carroId: Long,
    var id: Long = -1
) {
    fun toContentValues() : ContentValues {
        val valores = ContentValues()

        valores.put(TabelaServiços.CAMPO_NOME,nome)
        valores.put(TabelaServiços.CAMPO_DATA,data)
        valores.put(TabelaServiços.CAMPO_CARRO_ID,carroId)

        return valores
    }
}