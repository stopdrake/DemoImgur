package com.example.vsing.demimgurjava.presenter

import android.util.Log

import com.example.vsing.demimgurjava.adapter.model.ImageAdapterModel
import com.example.vsing.demimgurjava.data.QueryBuilder
import com.example.vsing.demimgurjava.data.model.Data
import com.example.vsing.demimgurjava.data.model.Image

import java.util.ArrayList

import javax.inject.Inject


/**
 * Implementation of MainPresenter
 */

class MainPresenterImpl @Inject
constructor(internal var mMainView: MainPresenter.IView, internal var mImageAdapterModel: ImageAdapterModel) : MainPresenter {


    override fun loadInitialData() {
        QueryBuilder.createSearchQuery("cats", object : QueryBuilder.QueryResult {
            override fun onFailure(error: String) {
                Log.d("yes", "onfail: " + error)
            }

            override fun onSuccess(dataList: List<Data>?) {
                val imageList = ArrayList<Image>()
                for (data in dataList!!) {
                    if (data.images != null)
                        imageList.addAll(data.images!!)
                }
                mImageAdapterModel.addList(imageList)
                mMainView.updateView()
            }
        })
    }
}
