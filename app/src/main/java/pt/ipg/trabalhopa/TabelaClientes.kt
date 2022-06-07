package pt.ipg.trabalhopa

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaClientes(db: SQLiteDatabase):TabelaBD(db, NOME_TABELA) {
    override fun cria() {
        db.execSQL(
            "CREATE TABLE $NOME_TABELA(${BaseColumns._ID}INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "$CAMPO_NOME TEXT NOT NULL," +
                    "$CAMPO_NIF TEXT NOT NULL," +
                    "$CAMPO_CONTACTO INTEGER NOT NULL," +
                    "$CAMPO_MORADA TEXT NOT NULL," +
                    "FOREIGN KEY ($CAMPO_CARRO_ID) REFERENCES ${TabelaCarros.NOME_TABELA}(${BaseColumns._ID}) ON DELETE RESTRICT)"
        )
    }

    companion object {
        const val NOME_TABELA = "cliente"
        const val CAMPO_NOME = "nome"
        const val CAMPO_NIF = "NIF"
        const val CAMPO_CONTACTO = "contacto"
        const val CAMPO_MORADA = "morada"
        const val CAMPO_CARRO_ID = "carroID"
    }
}