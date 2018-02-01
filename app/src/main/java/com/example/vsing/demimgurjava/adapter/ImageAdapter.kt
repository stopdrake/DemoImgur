package com.example.vsing.demimgurjava.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.vsing.demimgurjava.R
import com.example.vsing.demimgurjava.adapter.model.ImageAdapterModel
import com.example.vsing.demimgurjava.adapter.view.ImageAdapterView
import com.example.vsing.demimgurjava.adapter.view.ViewHolder
import com.example.vsing.demimgurjava.data.model.Image
import com.squareup.picasso.Picasso

import java.util.ArrayList

/**
 * Main adapter for recycler view.
 * ImageAdapterModel for data handling
 * ImageAdapterView for view handling
 */

class ImageAdapter(private val mContext: Context) : RecyclerView.Adapter<ViewHolder>(), ImageAdapterModel, ImageAdapterView {

    private val mImageList: MutableList<Image>

    override val size: Int
        get() = itemCount

    init {
        mImageList = ArrayList()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currImage = mImageList[position]
        Picasso.with(mContext).load(currImage.link).fit().centerCrop().into(holder.image)
        if (currImage.description != null && !currImage.description!!.isEmpty())
            holder.description.text = currImage.description
        else
            holder.description.visibility = View.GONE
    }

    override fun getItemCount(): Int {
        return mImageList.size
    }

    override fun refreshView() {
        notifyDataSetChanged()
    }

    override fun addList(data: List<Image>) {
        mImageList.addAll(data)
    }

    override fun add(data: Image) {
        mImageList.add(data)
    }

    override fun remove(data: Image) {
        mImageList.remove(data)
    }

    override fun clearAll() {
        mImageList.clear()
    }


}
