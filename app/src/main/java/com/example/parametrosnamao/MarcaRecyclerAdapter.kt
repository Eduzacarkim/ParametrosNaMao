package com.example.parametrosnamao

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import kotlinx.android.synthetic.main.marca_card_view.view.*

class MarcaRecyclerAdapter(
    val marca: List<String> = listOf("Weg", "Schineider", "SIEMENS"),
    private val logo: List<Int> = listOf(R.mipmap.logo_weg_foreground, R.mipmap.logo_schinider_foreground, R.mipmap.ic_launcher_round)
) : Adapter<MarcaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarcaViewHolder {
        return MarcaViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.marca_card_view, parent, false))
    }
    override fun onBindViewHolder(holder: MarcaViewHolder, position: Int) {
        holder.textView.text = marca[position]
        holder.imageView.setImageResource(logo[position])
    }

    override fun getItemCount(): Int {
        return 3
    }

}
class MarcaViewHolder(val view: View): ViewHolder(view){
    val imageView: ImageView = view.findViewById(R.id.logo_view)
    val textView: TextView = view.findViewById(R.id.marca_text)


    init {
        view.setOnClickListener{
            val position1: Int = adapterPosition
            val intent = Intent(view.context, SecondaryActivity::class.java).putExtra("key", position1)
            view.context.startActivity(intent)
        }
    }
}
