package com.example.vsing.demimgurjava.adapter.view

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView

import com.example.vsing.demimgurjava.R

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var cv: CardView
    var image: ImageView
    var description: TextView

    init {
        cv = itemView.findViewById(R.id.cardView)
        image = itemView.findViewById(R.id.image)
        description = itemView.findViewById(R.id.description)
    }
}