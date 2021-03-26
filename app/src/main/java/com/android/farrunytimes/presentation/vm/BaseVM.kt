package com.android.farrunytimes.presentation.vm

import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.farrunytimes.domain.model.Response
import kotlinx.coroutines.cancel

/**
 *   Created by Mohd Farhan on 25/03/2021.
 */
open class BaseVM : ViewModel() , LifecycleObserver {

    val liveData = MutableLiveData<Response<Any>>()

    fun responseLiveData() : MutableLiveData<Response<Any>> {
        return liveData
    }

    override fun onCleared() {
        viewModelScope.cancel()
        super.onCleared()
    }
}