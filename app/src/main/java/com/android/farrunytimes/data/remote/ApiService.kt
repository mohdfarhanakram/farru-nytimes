package com.android.farrunytimes.data.remote

import com.android.farrunytimes.domain.NewsInfo
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 *   Created by Mohd Farhan on 24/03/2021.
 *   QG7V7GJlPb4HVhSVoQodw3mlC2kGPtPZ
 *   http://api.nytimes.com/svc/mostpopular/v2/mostviewed/all-sections/7.json?api-key=QG7V7GJlPb4HVhSVoQodw3mlC2kGPtPZ
 */
interface ApiService {

    @GET("mostviewed/{section}/{period}.json")
    suspend fun getPopularNews(
        @Path("section") section : String,
        @Path("period") period : String,
        @Query("api-key") apiKey : String
    ): NewsInfo
}