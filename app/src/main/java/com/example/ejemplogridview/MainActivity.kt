package com.example.ejemplogridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var frutas = ArrayList<String>()

        frutas.add("Manzana")
        frutas.add("Durazno")
        frutas.add("Platano")
        frutas.add("Sandia")

        var grid:GridView = findViewById(R.id.grid)
        val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        grid.adapter = adaptador
        
        grid.setOnItemClickListener { adapterView, view, i, l ->

            Toast.makeText(this, frutas.get(i), Toast.LENGTH_SHORT).show()
        }


    }
}