package com.keremkulac.newsapp.network

import com.keremkulac.newsapp.model.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("emailed/7.json")
    suspend fun getPopularNews(@Query("api-key") key : String) : Response
}