package com.android.farrunytimes.domain

import com.google.gson.annotations.SerializedName


/**
 *   Created by Mohd Farhan on 24/03/2021.
 */
data class News (
        @SerializedName("id") val id : Int,
        @SerializedName("url") val url : String,
        @SerializedName("title") val title : String,
        @SerializedName("byline") val byLine : String,
        @SerializedName("type") val type : String,
        @SerializedName("published_date") val publishedDate : String,
        @SerializedName("updated") val updated : String,
        @SerializedName("section") val section : String
)