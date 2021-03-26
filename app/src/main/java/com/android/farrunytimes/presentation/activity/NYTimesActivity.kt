package com.android.farrunytimes.presentation.activity

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.android.farrunytimes.NyTimeApplication
import com.android.farrunytimes.R
import com.android.farrunytimes.databinding.ActivityNyTimesBinding
import com.android.farrunytimes.presentation.vm.NewsListViewModel
import javax.inject.Inject

/**
 *   Created by Mohd Farhan on 25/03/2021.
 */
class NYTimesActivity : BaseActivity() {
    lateinit var binding: ActivityNyTimesBinding

    @Inject
    lateinit var newsListViewModel: NewsListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = DataBindingUtil.setContentView(this, R.layout.activity_ny_times)
        binding.btnClick.setOnClickListener {
            newsListViewModel.fetchNewsList()
        }
        val newsListComponent = (applicationContext as NyTimeApplication).applicationComponent.loginComponent().create()
        newsListComponent.inject(this)

        newsListViewModel.responseLiveData().observe(this){
          showMessage(it.toString())
        }


    }



}