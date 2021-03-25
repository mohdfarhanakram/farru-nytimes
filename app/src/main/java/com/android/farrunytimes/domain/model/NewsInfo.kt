package com.android.farrunytimes.domain.model

import com.google.gson.annotations.SerializedName

/**
 *   Created by Mohd Farhan on 24/03/2021.
 */
data class NewsInfo(
        @SerializedName("status") val status : String,
        @SerializedName("num_results") val numResult : Int,
        @SerializedName("results") val results : List<News>
)