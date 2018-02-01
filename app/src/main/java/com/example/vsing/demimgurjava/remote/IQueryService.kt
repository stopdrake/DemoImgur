package com.example.vsing.demimgurjava.remote

import com.example.vsing.demimgurjava.data.model.Imgur

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

/**
 * Created by vsing on 1/29/2018.
 */

interface IQueryService {

    @Headers("Authorization: Client-ID d00ef44ff15dd69")
    @GET("gallery/search")
    fun search(@Query("q") query: String): Call<Imgur>

}
