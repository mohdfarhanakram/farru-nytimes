package com.android.farrunytimes.domain.usecase

import com.android.farrunytimes.data.repository.IRepository
import com.android.farrunytimes.domain.model.NewsInfo
import com.android.farrunytimes.domain.model.NewsRequest
import com.android.farrunytimes.domain.usecase.base.UseCase
import javax.inject.Inject

/**
 *   Created by Mohd Farhan on 25/03/2021.
 */
class NewsUseCase @Inject constructor(
    private val repository: IRepository
) : UseCase<NewsInfo, NewsRequest?>() {

    override suspend fun run(params: NewsRequest?): NewsInfo {
        // NewsRequest is nullable type, but this NewsRequest always would be non-null
        return repository.getPopularNews(params!!.section, params.period, params.apiKey)
    }

}