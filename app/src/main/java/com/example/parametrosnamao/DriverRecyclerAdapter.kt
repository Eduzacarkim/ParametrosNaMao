package com.example.parametrosnamao

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.parametrosnamao.R.id.*
import java.nio.file.Files.size

class DriverRecyclerAdapter(val itemList: ListaL) : RecyclerView.Adapter<DriverViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DriverViewHolder {
        return  DriverViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.driver_card_view, parent, false)
        )}

    override fun onBindViewHolder(holder: DriverViewHolder, position: Int) {

        holder.textView1.text = itemList.inversor[position]
        holder.imageView1.setImageResource(itemList.logoInversor)

    }
    override fun getItemCount(): Int {
        return itemList.inversor.size
    }

}
class DriverViewHolder (v : View):RecyclerView.ViewHolder(v){


    val textView1: TextView = v.findViewById(driver_id)
    val imageView1: ImageView = v.findViewById(logo_driver)

    init {
        val intent1 = Intent(v.context, SecondaryActivity::class.java)


        v.context.startActivity(intent1)
    }

}
