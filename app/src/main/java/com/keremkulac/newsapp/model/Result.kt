package com.keremkulac.newsapp.model

import com.google.gson.annotations.SerializedName

data class Result(
    val uri: String,
    val url: String,
    val id: Long,
    @SerializedName("asset_id") val assetID: Long,
    val source: String,
    @SerializedName("published_date") val publishedDate: String,
    val updated: String,
    val section: String,
    val subsection: String,
    val nytdsection: String,
    @SerializedName("adx_keywords") val adxKeywords: String,
    val column: String? = null,
    val byline: String,
    val type: String,
    val title: String,
    val abstract: String,
    @SerializedName("des_facet") val desFacet: List<String>,
    @SerializedName("org_facet") val orgFacet: List<String>,
    @SerializedName("per_facet") val perFacet: List<String>,
    @SerializedName("geo_facet") val geoFacet: List<String>,
    val media: List<Media>,
    @SerializedName("eta_id") val etaID: Int
)
