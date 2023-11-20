package com.keremkulac.newsapp.di

import com.keremkulac.newsapp.data.repository.NewsRepository
import com.keremkulac.newsapp.data.NewsRepositoryImp
import com.keremkulac.newsapp.network.ApiService
import com.keremkulac.newsapp.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {


    @Singleton
    @Provides
    fun provideRepository() : NewsRepository {
        return NewsRepository(provideRetrofitInstance(BASE_URL).create(ApiService::class.java))
    }

    @Singleton
    @Provides
    fun provideRepositoryImp(repository: NewsRepository) : NewsRepositoryImp {
        return NewsRepositoryImp(repository)
    }

    @Provides
    @Singleton
    fun provideBaseUrl() = BASE_URL

    @Provides
    @Singleton
    fun provideRetrofitInstance(BASE_URL : String) : Retrofit {
        return  Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()


    }

}