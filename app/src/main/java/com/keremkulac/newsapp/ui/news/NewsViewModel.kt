package com.keremkulac.newsapp.ui.news

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.keremkulac.newsapp.data.NewsRepositoryImp
import com.keremkulac.newsapp.model.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(private val apiRepositoryImp: NewsRepositoryImp) : ViewModel(){
    private val _popularNews = MutableLiveData<Response>()
    val popularNews: LiveData<Response>
        get() = _popularNews

    init {
        getPopularNews()
    }

   private fun getPopularNews(){
        CoroutineScope(Dispatchers.Main).launch {
            _popularNews.value =  apiRepositoryImp.getPopularNews()
        }
    }
}