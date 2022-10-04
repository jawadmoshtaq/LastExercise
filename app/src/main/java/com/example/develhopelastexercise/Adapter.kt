package com.example.develhopelastexercise

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class Adapter(private val phones:ArrayList<Phones>):RecyclerView.Adapter<Adapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, ViewType:Int):MyViewHolder{
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.single_item,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = phones[position]
        holder.title.setImageResource(currentItem.title)
        holder.header.text=currentItem.header
    }

    override fun getItemCount(): Int {
        return phones.size
    }
    class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val title:ShapeableImageView=itemView.findViewById(R.id.title_image)
        val header:TextView=itemView.findViewById(R.id.tv_title)
    }

}