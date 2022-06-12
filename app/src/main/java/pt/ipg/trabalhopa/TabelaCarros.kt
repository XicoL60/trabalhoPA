package pt.ipg.trabalhopa

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaCarros(db: SQLiteDatabase):TabelaBD(db, NOME_TABELA)  {
    override fun cria(){
        db.execSQL("CREATE TABLE $NOME_TABELA(${BaseColumns._ID}INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "$CAMPO_MARCA TEXT NOT NULL," +
                "$CAMPO_MODELO TEXT NOT NULL," +
                "$CAMPO_MATRICULA TEXT NOT NULL," +
                "$CAMPO_ANO INTEGER NOT NULL," +
                "FOREIGN KEY ($CAMPO_CLIENTE_ID) REFERENCES ${TabelaClientes.NOME_TABELA}(${BaseColumns._ID}) ON DELETE RESTRICT,"+
                "FOREIGN KEY ($CAMPO_SERVIÇO_ID) REFERENCES ${TabelaServices.NOME_TABELA}(${BaseColumns._ID}) ON DELETE RESTRICT)")
    }
    companion object{
        const val NOME_TABELA = "carros"
        const val CAMPO_MARCA = "marca"
        const val CAMPO_MODELO = "modelo"
        const val CAMPO_MATRICULA = "matricula"
        const val CAMPO_ANO = "ano"
        const val CAMPO_CLIENTE_ID = "clienteID"
        const val CAMPO_SERVIÇO_ID = "serviçoID"
    }
}
