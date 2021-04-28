package com.example.replicaviewitauapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MenuItemAdapter :RecyclerView.Adapter<MenuItemAdapter.MenuItemAdapterViewHolder>(){

    private val list = mutableListOf<MenuItemModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuItemAdapter.MenuItemAdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_menu,parent,false)
        return MenuItemAdapterViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuItemAdapter.MenuItemAdapterViewHolder, position: Int) {
        holder.iniciaViews(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun setItensList(list: List<MenuItemModel>){
        this.list.clear()
        this.list.addAll(list)
    }

    class MenuItemAdapterViewHolder (itemView:View) : RecyclerView.ViewHolder(itemView){
        private val tituloItem by lazy {
            itemView.findViewById<TextView>(R.id.nome_item)
        }
        fun iniciaViews(item: MenuItemModel){
            tituloItem.text = item.titulo
        }
    }
}