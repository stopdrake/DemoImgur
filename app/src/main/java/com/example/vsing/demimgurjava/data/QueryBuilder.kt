package com.example.vsing.demimgurjava.data

import android.view.View
import android.widget.Toast

import com.example.vsing.demimgurjava.data.model.Data
import com.example.vsing.demimgurjava.data.model.Imgur
import com.example.vsing.demimgurjava.remote.IQueryService
import com.example.vsing.demimgurjava.remote.RemoteAPIUtils

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Class to create and execute queries
 */

object QueryBuilder {
    fun createSearchQuery(query: String, result: QueryResult) {
        RemoteAPIUtils.queryService.search(query).enqueue(createApiCallback(result))
    }

    private fun createApiCallback(result: QueryResult): Callback<Imgur> {
        return object : Callback<Imgur> {
            override fun onResponse(call: Call<Imgur>, response: Response<Imgur>) {
                if (response.isSuccessful) {
                    result.onSuccess(response.body().data)
                } else {
                    //TODO
                }
            }

            override fun onFailure(call: Call<Imgur>, t: Throwable) {
                result.onFailure(t.message!!)
            }
        }
    }

    interface QueryResult {
        fun onSuccess(dataList: List<Data>?)
        fun onFailure(error: String)
    }
}
