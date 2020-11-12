package com.example.parametrosnamao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.marca_card_view.*
import kotlinx.android.synthetic.main.marca_card_view.view.*
import com.example.parametrosnamao.MarcaViewHolder

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewManager = LinearLayoutManager(this)

        viewAdapter = MarcaRecyclerAdapter()


        recyclerView = findViewById<RecyclerView>(R.id.RecyclerMarcas).apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter

        }


    }
}