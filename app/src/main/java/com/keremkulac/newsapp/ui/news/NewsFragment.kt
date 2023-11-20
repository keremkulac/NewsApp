package com.keremkulac.newsapp.ui.news

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.keremkulac.newsapp.databinding.FragmentNewsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NewsFragment : Fragment() {
    private val viewModel by viewModels<NewsViewModel>()
    private lateinit var binding : FragmentNewsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentNewsBinding.inflate(inflater,container,false)
        click()
        return binding.root
    }


    private fun click(){
        binding.click.setOnClickListener {
            viewModel.popularNews.observe(viewLifecycleOwner){
                Log.d("TAG",it.results[0].title)
            }
        }
    }


}