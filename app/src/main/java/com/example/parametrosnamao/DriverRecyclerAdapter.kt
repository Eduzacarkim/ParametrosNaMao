package com.example.parametrosnamao

import android.accounts.AccountManager.get
import android.content.Intent
import android.content.Intent.*
import android.icu.text.Transliterator
import android.media.CamcorderProfile.get
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.driver_card_view.view.*
import java.lang.reflect.Array.*
import java.text.ParsePosition

class DriverRecyclerAdapter(
    var Driver: List<String> = listOf("Weg", "Schineider", "SIEMENS")
//    var Logo: R.mipmap.ic_launcher_round
) : RecyclerView.Adapter<DriverViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DriverViewHolder {
        return  DriverViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.driver_card_view, parent, false)
        )}

    override fun onBindViewHolder(holder: DriverViewHolder, position: Int) {

        holder.textView1.text = Driver[position]
        holder.imageView1.setImageResource(R.mipmap.ic_launcher_round)

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
