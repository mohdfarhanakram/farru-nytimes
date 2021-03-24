package com.android.farrunytimes.data.repository

import com.android.farrunytimes.domain.NewsInfo

/**
 *   Created by Mohd Farhan on 24/03/2021.
 */
interface IRepository {
    suspend fun getPopularNews(section:String, period:String, apiKey:String) : NewsInfo
}