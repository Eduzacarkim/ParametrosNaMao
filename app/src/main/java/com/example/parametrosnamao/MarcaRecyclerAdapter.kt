package com.example.parametrosnamao

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.parametrosnamao.MarcaRecyclerAdapter.MarcaViewHolder
import kotlinx.android.synthetic.main.marca_card_view.view.*

class MarcaRecyclerAdapter(
    private val marca: List<String>,
    private val logo: List<Int>
    ) : RecyclerView.Adapter<MarcaViewHolder>() {

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

    inner class MarcaViewHolder(val view: View):RecyclerView.ViewHolder(view){
        val imageView: ImageView = view.findViewById(R.id.logo_view)
        val textView: TextView = view.findViewById(R.id.marca_text)
        init {
            view.setOnClickListener{
                val position: Int = adapterPosition
                val intent = Intent(view.context, SecondaryActivity::class.java)

                view.context.startActivity(intent)
            }
        }
    }
}

