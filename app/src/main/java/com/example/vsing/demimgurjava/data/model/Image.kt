package com.example.vsing.demimgurjava.data.model

import java.math.BigInteger
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Image {

    @SerializedName("id")
    @Expose
    var id: String? = null
    @SerializedName("title")
    @Expose
    var title: Any? = null
    @SerializedName("description")
    @Expose
    var description: String? = null
    @SerializedName("datetime")
    @Expose
    var datetime: Int? = null
    @SerializedName("type")
    @Expose
    var type: String? = null
    @SerializedName("animated")
    @Expose
    var animated: Boolean? = null
    @SerializedName("width")
    @Expose
    var width: Int? = null
    @SerializedName("height")
    @Expose
    var height: Int? = null
    @SerializedName("size")
    @Expose
    var size: Int? = null
    @SerializedName("views")
    @Expose
    var views: Int? = null
    @SerializedName("bandwidth")
    @Expose
    var bandwidth: BigInteger? = null
    @SerializedName("vote")
    @Expose
    var vote: Any? = null
    @SerializedName("favorite")
    @Expose
    var favorite: Boolean? = null
    @SerializedName("nsfw")
    @Expose
    var nsfw: Any? = null
    @SerializedName("section")
    @Expose
    var section: Any? = null
    @SerializedName("account_url")
    @Expose
    var accountUrl: Any? = null
    @SerializedName("account_id")
    @Expose
    var accountId: Any? = null
    @SerializedName("is_ad")
    @Expose
    var isAd: Boolean? = null
    @SerializedName("in_most_viral")
    @Expose
    var inMostViral: Boolean? = null
    @SerializedName("has_sound")
    @Expose
    var hasSound: Boolean? = null
    @SerializedName("tags")
    @Expose
    var tags: List<Any>? = null
    @SerializedName("ad_type")
    @Expose
    var adType: Int? = null
    @SerializedName("ad_url")
    @Expose
    var adUrl: String? = null
    @SerializedName("in_gallery")
    @Expose
    var inGallery: Boolean? = null
    @SerializedName("link")
    @Expose
    var link: String? = null
    @SerializedName("comment_count")
    @Expose
    var commentCount: Any? = null
    @SerializedName("favorite_count")
    @Expose
    var favoriteCount: Any? = null
    @SerializedName("ups")
    @Expose
    var ups: Any? = null
    @SerializedName("downs")
    @Expose
    var downs: Any? = null
    @SerializedName("points")
    @Expose
    var points: Any? = null
    @SerializedName("score")
    @Expose
    var score: Any? = null

}