package com.android.farrunytimes.domain.usecase.base

import com.android.farrunytimes.data.remote.ApiError

/**
 *   Created by Mohd Farhan on 25/03/2021.
 */
interface UseCaseResponse<Type> {

    fun onSuccess(result: Type)

    fun onError(apiError: ApiError?)
}