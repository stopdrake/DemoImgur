package com.example.vsing.demimgurjava.data.model

import java.math.BigInteger
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Data {

    @SerializedName("id")
    @Expose
    var id: String? = null
    @SerializedName("title")
    @Expose
    var title: String? = null
    @SerializedName("description")
    @Expose
    var description: Any? = null
    @SerializedName("datetime")
    @Expose
    var datetime: Int? = null
    @SerializedName("cover")
    @Expose
    var cover: String? = null
    @SerializedName("cover_width")
    @Expose
    var coverWidth: Int? = null
    @SerializedName("cover_height")
    @Expose
    var coverHeight: Int? = null
    @SerializedName("account_url")
    @Expose
    var accountUrl: String? = null
    @SerializedName("account_id")
    @Expose
    var accountId: Int? = null
    @SerializedName("privacy")
    @Expose
    var privacy: String? = null
    @SerializedName("layout")
    @Expose
    var layout: String? = null
    @SerializedName("views")
    @Expose
    var views: Int? = null
    @SerializedName("link")
    @Expose
    var link: String? = null
    @SerializedName("ups")
    @Expose
    var ups: Int? = null
    @SerializedName("downs")
    @Expose
    var downs: Int? = null
    @SerializedName("points")
    @Expose
    var points: Int? = null
    @SerializedName("score")
    @Expose
    var score: Int? = null
    @SerializedName("is_album")
    @Expose
    var isAlbum: Boolean? = null
    @SerializedName("vote")
    @Expose
    var vote: Any? = null
    @SerializedName("favorite")
    @Expose
    var favorite: Boolean? = null
    @SerializedName("nsfw")
    @Expose
    var nsfw: Boolean? = null
    @SerializedName("section")
    @Expose
    var section: String? = null
    @SerializedName("comment_count")
    @Expose
    var commentCount: Int? = null
    @SerializedName("favorite_count")
    @Expose
    var favoriteCount: Int? = null
    @SerializedName("topic")
    @Expose
    var topic: String? = null
    @SerializedName("topic_id")
    @Expose
    var topicId: Int? = null
    @SerializedName("images_count")
    @Expose
    var imagesCount: Int? = null
    @SerializedName("in_gallery")
    @Expose
    var inGallery: Boolean? = null
    @SerializedName("is_ad")
    @Expose
    var isAd: Boolean? = null
    @SerializedName("tags")
    @Expose
    var tags: List<Tag>? = null
    @SerializedName("ad_type")
    @Expose
    var adType: Int? = null
    @SerializedName("ad_url")
    @Expose
    var adUrl: String? = null
    @SerializedName("in_most_viral")
    @Expose
    var inMostViral: Boolean? = null
    @SerializedName("images")
    @Expose
    var images: List<Image>? = null
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
    @SerializedName("bandwidth")
    @Expose
    var bandwidth: BigInteger? = null
    @SerializedName("has_sound")
    @Expose
    var hasSound: Boolean? = null
    @SerializedName("mp4")
    @Expose
    var mp4: String? = null
    @SerializedName("gifv")
    @Expose
    var gifv: String? = null
    @SerializedName("mp4_size")
    @Expose
    var mp4Size: Int? = null
    @SerializedName("looping")
    @Expose
    var looping: Boolean? = null

}