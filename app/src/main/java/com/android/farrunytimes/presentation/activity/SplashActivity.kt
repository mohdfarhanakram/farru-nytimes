package com.android.farrunytimes.presentation.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.databinding.DataBindingUtil
import com.android.farrunytimes.R
import com.android.farrunytimes.databinding.ActivitySplashBinding

class SplashActivity : BaseActivity() {

    private lateinit var binding : ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            navigateToNext();
        }, 3000)
    }

    private fun navigateToNext(){
        val intent  = Intent(this,NYTimesActivity::class.java)
        startActivity(intent)
        finish()
    }
}