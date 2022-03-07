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

        var frutas = ArrayList<Fruta>()

       /* frutas.add("Manzana")
        frutas.add("Durazno")
        frutas.add("Platano")
        frutas.add("Sandia")
*/
        frutas.add(Fruta("Manzana", R.drawable.manzana))
        frutas.add(Fruta("Durazno", R.drawable.durazno))
        frutas.add(Fruta("Platano", R.drawable.platano))
        frutas.add(Fruta("Sandia", R.drawable.sandia))

        var grid:GridView = findViewById(R.id.grid)
       // val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
       val adaptador = AdaptadorCustom(this, frutas)
        grid.adapter = adaptador
        
        grid.setOnItemClickListener { adapterView, view, i, l ->

            Toast.makeText(this, frutas.get(i).nombre, Toast.LENGTH_SHORT).show()
        }


    }
}