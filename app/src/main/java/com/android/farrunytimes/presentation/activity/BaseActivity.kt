package com.android.farrunytimes.presentation.activity

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 *   Created by Mohd Farhan on 25/03/2021.
 */
abstract class BaseActivity : AppCompatActivity() {

    fun showMessage(message : String){
        Toast.makeText(this,message,Toast.LENGTH_LONG).show()
    }
}