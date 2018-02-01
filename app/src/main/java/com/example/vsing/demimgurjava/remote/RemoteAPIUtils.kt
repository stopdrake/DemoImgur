package com.example.vsing.demimgurjava.remote

object RemoteAPIUtils {

    val BASE_URL = "https://api.imgur.com/3/"
    val query = "q"
    val start = "start"
    val count = "count"
    val entityId = "entity_id"
    val clientId = "d00ef44ff15dd69"

    val queryService: IQueryService
        get() = RetrofitClient.getClient(BASE_URL)!!.create(IQueryService::class.java!!)
}
