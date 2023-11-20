package com.keremkulac.newsapp.data

import com.keremkulac.newsapp.data.repository.NewsRepository

class NewsRepositoryImp(private val repository: NewsRepository) {
    suspend fun getPopularNews() = repository.getPopularNews()
}