package com.keremkulac.newsapp.data.repository

import com.keremkulac.newsapp.model.Response
import com.keremkulac.newsapp.network.ApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class NewsRepository(private val apiService: ApiService) {
    suspend fun getPopularNews() : Response =
        withContext(Dispatchers.IO){
            return@withContext apiService.getPopularNews("UQNRJKg6ebWRXomMf0cLG6sLSKAorZmV")
        }
}