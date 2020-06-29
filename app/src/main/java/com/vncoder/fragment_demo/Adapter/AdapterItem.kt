package com.vncoder.fragment_demo.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vncoder.fragment_demo.Fragment.Fragment_4
import com.vncoder.fragment_demo.Item.ItemObject
import com.vncoder.fragment_demo.R
import kotlinx.android.synthetic.main.item_object.view.*
import java.util.zip.Inflater

class AdapterItem(val listItem: ArrayList<ItemObject>?)
    : RecyclerView.Adapter<AdapterItem.ViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterItem.ViewHolder {
       val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_object,parent,false)
        return ViewHolder(itemView)
    }

    override fun getItemCount() = listItem!!.size



    override fun onBindViewHolder(holder: AdapterItem.ViewHolder, position: Int) {
            val itemss = listItem?.get(position)

        holder.imageView.setImageResource(itemss?.img!!)
        holder.textView.text = itemss.title
    }

    class ViewHolder(itemView :View ):RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.img_item
        val textView: TextView = itemView.tv_item
    }

}