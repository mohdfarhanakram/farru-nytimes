package com.android.farrunytimes.presentation.vm


import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.viewModelScope
import com.android.farrunytimes.data.remote.ApiError
import com.android.farrunytimes.di.scope.ActivityScope
import com.android.farrunytimes.domain.model.NewsInfo
import com.android.farrunytimes.domain.model.NewsRequest
import com.android.farrunytimes.domain.model.Response
import com.android.farrunytimes.domain.usecase.NewsUseCase
import com.android.farrunytimes.domain.usecase.base.UseCaseResponse
import javax.inject.Inject

/**
 *   Created by Mohd Farhan on 25/03/2021.
 */
class NewsListViewModel @Inject constructor(
    private val newsUseCase: NewsUseCase
): BaseVM() {

    private lateinit var mResult: NewsInfo


    fun fetchNewsList() {
        if(this::mResult.isInitialized){
            return
        }

        liveData.postValue(Response.Loading)
        newsUseCase.invoke(viewModelScope, NewsRequest(), object : UseCaseResponse<NewsInfo> {
            override fun onSuccess(result: NewsInfo) {
                mResult = result
                liveData.postValue(Response.Success(result))
            }

            override fun onError(apiError: ApiError?) {
                liveData.postValue(apiError?.getErrorMessage()?.let {
                    Response.Error(it)
                })
            }
        },)
    }
}