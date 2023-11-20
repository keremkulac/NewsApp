package com.keremkulac.newsapp.model

import com.google.gson.annotations.SerializedName

data class Response(
    val status : String,
    val copyright : String,
    val results : List<Result>,
    @SerializedName("num_results") val numResult: Int
)