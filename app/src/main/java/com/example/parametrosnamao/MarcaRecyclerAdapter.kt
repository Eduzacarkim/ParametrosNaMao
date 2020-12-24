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
    private val marca: List<String> = listOf("Weg", "Schineider", "SIEMENS"),
    private val logo: List<Int> = listOf(R.mipmap.logo_weg_foreground, R.mipmap.logo_schinider_foreground, R.mipmap.ic_launcher_round),
    var driver: List<String>,
    var logoDriver: Int

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
                    if (position == 0) {
                        driver = listOf("CFW100", "CFW500", "CFW700")
                        logoDriver = R.mipmap.logo_weg_foreground
                    }else{
                        if (position == 1){
                            driver = listOf("ALTIVAR 12", "ALTIVAR EASY 310", "ALTIVAR MACHINE ATV320", "ALTIVAR MACHINE ATV340")
                             logoDriver = R.mipmap.logo_schinider_foreground
                        }else{
                            if (position == 2){
                                 driver = listOf("SINAMICS V20", "INAMICS G120C", "SINAMICS G120", "SINAMICS G130","SINAMICS G110","SINAMICS G120D")
                                 logoDriver = R.mipmap.ic_launcher_round

                        }
                    }
                }

                view.context.startActivity(intent)
            }
        }
    }
}

