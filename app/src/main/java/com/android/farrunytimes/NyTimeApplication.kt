package com.android.farrunytimes

import android.app.Application
import com.android.farrunytimes.di.component.ApplicationComponent
import com.android.farrunytimes.di.component.DaggerApplicationComponent

/**
 *   Created by Mohd Farhan on 24/03/2021.
 */
class NyTimeApplication : Application(){
    lateinit var applicationComponent : ApplicationComponent
    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.create();
    }

}