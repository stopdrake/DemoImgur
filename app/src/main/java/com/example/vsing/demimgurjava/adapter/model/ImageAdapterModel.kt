package com.example.vsing.demimgurjava.adapter.model

import com.example.vsing.demimgurjava.data.model.Image

/**
 * Created by vsing on 1/29/2018.
 */

interface ImageAdapterModel {
    val size: Int
    fun addList(data: List<Image>)
    fun add(data: Image)
    fun remove(data: Image)
    fun clearAll()
}
