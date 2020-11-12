package com.example.parametrosnamao

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.driver_card_view.view.*

class DriverRecyclerAdapter : RecyclerView.Adapter<DriverViewHolder>(){
    val driverTitles = listOf("drivertitle", "drivertitle2")
    val driverLogosWeg = R.mipmap.logo_weg_foreground
    val driverLogosSchineider = R.mipmap .logo_schinider_foreground


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DriverViewHolder {
        return  DriverViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.driver_card_view, parent, false)
        )}

    override fun onBindViewHolder(holder: DriverViewHolder, position: Int) {
        val driverTitle = driverTitles[position]
        holder.view.driverId.text = driverTitle
    }
    override fun getItemCount(): Int {
        return 2
    }

}

class DriverViewHolder constructor(val view : View):RecyclerView.ViewHolder(view){

}