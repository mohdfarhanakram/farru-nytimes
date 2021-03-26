package com.android.farrunytimes.presentation.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.android.farrunytimes.domain.usecase.NewsUseCase
import javax.inject.Inject
import javax.inject.Provider

/**
 *   Created by Mohd Farhan on 26/03/2021.
 */
class AppViewModelFactory  @Inject constructor(private val newsUseCase: NewsUseCase): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(NewsListViewModel::class.java)) {
            NewsListViewModel(newsUseCase) as T
        } else {
            throw IllegalArgumentException("ViewModel Not Found")
        }
    }

}