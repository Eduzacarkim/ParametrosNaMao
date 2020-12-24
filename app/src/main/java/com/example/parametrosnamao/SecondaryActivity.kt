package com.example.parametrosnamao

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondaryActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: DriverRecyclerAdapter
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate (saveInstanceState: Bundle?) {
        super.onCreate(saveInstanceState)
        setContentView(R.layout.activity_driver)

        viewManager = LinearLayoutManager(this)

        viewAdapter

        recyclerView = findViewById<RecyclerView>(R.id.viewDriver).apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }
    }
}