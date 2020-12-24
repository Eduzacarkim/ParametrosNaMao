package com.example.parametrosnamao

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    private lateinit var marcaAdapter: MarcaRecyclerAdapter
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_marcas.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            marcaAdapter
            adapter = marcaAdapter
        }

    }


}
