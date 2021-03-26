package com.android.farrunytimes.presentation.activity

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
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
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = DataBindingUtil.setContentView(this, R.layout.activity_ny_times)

        val navHostFragment: NavHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

    }

    fun getNavController(): NavController {
        return navController
    }



}