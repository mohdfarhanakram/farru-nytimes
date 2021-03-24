package com.android.farrunytimes.data.repository

import com.android.farrunytimes.data.remote.ApiService
import com.android.farrunytimes.domain.NewsInfo
import javax.inject.Inject

/**
 *   Created by Mohd Farhan on 24/03/2021.
 */
class Repository @Inject constructor(private val apiService: ApiService) : IRepository {

    override suspend fun getPopularNews(
                section: String,
                period: String,
                apiKey: String
    )
    : NewsInfo {
        return apiService.getPopularNews(section,period,apiKey)
    }
}