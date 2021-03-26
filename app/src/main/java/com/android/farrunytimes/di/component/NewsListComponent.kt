package com.android.farrunytimes.di.component

import com.android.farrunytimes.di.scope.ActivityScope
import com.android.farrunytimes.presentation.activity.NYTimesActivity
import com.android.farrunytimes.presentation.fragment.NewsDetailFragment
import com.android.farrunytimes.presentation.fragment.NewsListFragment
import dagger.Subcomponent

/**
 *   Created by Mohd Farhan on 25/03/2021.
 */
@ActivityScope
@Subcomponent
interface NewsListComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create() : NewsListComponent
    }

    fun inject(NYTimesActivity: NYTimesActivity)
    fun inject(newsListFragment: NewsListFragment)
    fun inject(newsDetailFragment: NewsDetailFragment)
}