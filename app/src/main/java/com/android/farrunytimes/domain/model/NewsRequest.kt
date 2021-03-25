package com.android.farrunytimes.domain.model

/**
 *   Created by Mohd Farhan on 25/03/2021.
 */
data class NewsRequest(
    val section:String="",
    val period : String="",
    val apiKey : String=""
)