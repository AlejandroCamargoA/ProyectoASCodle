package com.example.avance02
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class sql(context: Context) : SQLiteOpenHelper(context, "Codle.db", null, 1){
    override fun onCreate(db: SQLiteDatabase?) {
        val creacion = "CREATE TABLE codle " +
                "(codID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "CodNombre TEXT, " +
                "CodAnio TEXT)"
        db!!.execSQL(creacion)

        db.execSQL("INSERT INTO codle(CodNombre, CodAnio) VALUES('C++', '2000')")
        db.execSQL("INSERT INTO codle(CodNombre, CodAnio) VALUES('C#', '1999')")
        db.execSQL("INSERT INTO codle(CodNombre, CodAnio) VALUES('C', '1998')")

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

}