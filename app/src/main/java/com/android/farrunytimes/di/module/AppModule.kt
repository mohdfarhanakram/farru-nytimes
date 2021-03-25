package com.android.farrunytimes.di.module

import com.android.farrunytimes.di.qualifier.BaseUrlString
import com.android.farrunytimes.di.qualifier.KeyString
import com.android.farrunytimes.di.scope.ApplicationScope
import dagger.Module
import dagger.Provides

/**
 *   Created by Mohd Farhan on 25/03/2021.
 */
@Module
class AppModule {

    @Provides
    @BaseUrlString
    @ApplicationScope
    fun provideBaseUrl() :String{
        return "http://api.nytimes.com/svc/mostpopular/v2/";
    }

    @Provides
    @KeyString
    @ApplicationScope
    fun provideApiKey() :String{
        return "QG7V7GJlPb4HVhSVoQodw3mlC2kGPtPZ";
    }
}