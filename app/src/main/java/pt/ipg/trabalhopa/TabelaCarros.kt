package pt.ipg.trabalhopa

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaCarros(db: SQLiteDatabase):TabelaBD(db, NOME_TABELA)  {
    override fun cria(){
        db.execSQL("CREATE TABLE $NOME_TABELA(${BaseColumns._ID}INTEGER PRIMARY KEY AUTOINCREMENT, $CAMPO_NOME TEXT NOT NULL)")
    }
    companion object{
        const val NOME_TABELA = "carros"
        const val CAMPO_NOME = "nome"
    }
}
