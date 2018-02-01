package com.example.vsing.demimgurjava.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Imgur {

    @SerializedName("data")
    @Expose
    var data: List<Data>? = null
    @SerializedName("success")
    @Expose
    var success: Boolean? = null
    @SerializedName("status")
    @Expose
    var status: Int? = null

}