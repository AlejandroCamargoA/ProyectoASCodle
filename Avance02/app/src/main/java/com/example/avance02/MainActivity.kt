package com.example.avance02

import android.database.sqlite.SQLiteOpenHelper
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var helper = sql(applicationContext)
        var db = helper.readableDatabase
        var rs = db.rawQuery("SELECT * FROM codle", null)

        if(rs.moveToNext())
            Toast.makeText(applicationContext, rs.getString(1), Toast.LENGTH_LONG).show()

        val SpinnerID = findViewById<Spinner>(R.id.spinID)

        val codles = arrayOf("C++", "C#", "C")
        val arrayAdp = ArrayAdapter(this@MainActivity, android.R.layout.simple_spinner_dropdown_item, codles)
        SpinnerID.adapter = arrayAdp

        SpinnerID?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@MainActivity, "seleccion es: $")
            }
        }

    }
}