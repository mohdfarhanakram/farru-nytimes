package com.android.farrunytimes.domain.model

/**
 *   Created by Mohd Farhan on 25/03/2021.
 */
data class NewsRequest(
    val section:String="all-sections",
    val period : String="7",
    val apiKey : String="QG7V7GJlPb4HVhSVoQodw3mlC2kGPtPZ"
)