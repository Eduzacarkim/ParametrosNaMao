package com.example.parametrosnamao

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DriverRecyclerAdapter() : RecyclerView.Adapter<DriverViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DriverViewHolder {
        return  DriverViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.driver_card_view, parent, false)
        )}

    override fun onBindViewHolder(holder: DriverViewHolder, position: Int) {

        holder.textView1.text = driver
        holder.imageView1.setImageResource(e.hashCode())

    }
    override fun getItemCount(): Int {
        return 2
    }

}
class DriverViewHolder (v : View):RecyclerView.ViewHolder(v){

    val imageView1: ImageView = v.findViewById(R.id.logo_deiver)
    val textView1: TextView = v.findViewById(R.id.driver_id)

    init {
        val intent1 = Intent(v.context, SecondaryActivity::class.java)


        v.context.startActivity(intent1)
    }

}
