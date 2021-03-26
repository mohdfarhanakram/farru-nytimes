package com.android.farrunytimes.presentation.fragment

import android.content.Context
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import com.android.farrunytimes.domain.model.Response
import com.android.farrunytimes.presentation.activity.BaseActivity
import com.android.farrunytimes.presentation.activity.NYTimesActivity
import com.android.farrunytimes.presentation.vm.NewsListViewModel
import javax.inject.Inject

/**
 *   Created by Mohd Farhan on 25/03/2021.
 */
abstract class BaseFragment : Fragment(),View.OnClickListener {

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }


    var loaderView : View? = null;

    fun showResult(result: Response<Any>) {
        when(result) {
            is Response.Success -> {
                loader(false)
                populateUi(result.data)
            }
            is Response.Error -> {
                showMessage(result.error)
                loader(false)
            }
            is Response.Loading -> {
                loader(true)
            }
        }
    }

    open fun populateUi(result: Any){

    }


    fun loader(show: Boolean){
        if(show)
            loaderView?.visibility = View.VISIBLE
        else
            loaderView?.visibility = View.GONE
    }



    fun showMessage(message: String){
        (activity as BaseActivity).showMessage(message)
    }


   fun getNavController() : NavController?{
        return (activity as NYTimesActivity).getNavController()
   }

}