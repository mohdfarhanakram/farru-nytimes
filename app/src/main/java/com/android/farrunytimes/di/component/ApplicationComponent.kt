package com.android.farrunytimes.di.component

import com.android.farrunytimes.di.module.AppModule
import com.android.farrunytimes.di.module.NetworkModule
import com.android.farrunytimes.di.scope.ApplicationScope
import dagger.Component

/**
 *   Created by Mohd Farhan on 25/03/2021.
 */

@ApplicationScope
@Component(modules = [NetworkModule::class,AppModule::class])
interface ApplicationComponent {

}