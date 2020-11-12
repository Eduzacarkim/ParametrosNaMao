package com.example.parametrosnamao

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.marca_card_view.view.*
import java.nio.file.Files.list
import java.nio.file.Files.size
import java.util.ArrayList

class MarcaRecyclerAdapter : RecyclerView.Adapter<MarcaViewHolder>() {

    val marcaTitles = listOf("Weg", "Schineider")
    val marcaImages = listOf(R.mipmap.logo_weg_foreground, R.mipmap.logo_schinider_foreground)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarcaViewHolder {
        return MarcaViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.marca_card_view, parent, false)
        )
    }
    override fun onBindViewHolder(holder: MarcaViewHolder, position: Int) {
        val marcaTitle = marcaTitles[position]
        val marcaImage = marcaImages[position]
        holder.view.marcaView?.text = marcaTitle
        holder.view.logoView.setImageResource(marcaImage)
            }

    override fun getItemCount(): Int {
        return 2
    }
}


    class MarcaViewHolder constructor(val view: View):RecyclerView.ViewHolder(view){
        init {
            view.setOnClickListener {
                val intent = Intent(view.context, SecondaryActivity::class.java)

                view.context.startActivity(intent)
            }
        }

        }
//dfsdf

