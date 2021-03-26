package com.android.farrunytimes.presentation.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.android.farrunytimes.NyTimeApplication
import com.android.farrunytimes.R
import com.android.farrunytimes.databinding.FragmentNewsListBinding
import com.android.farrunytimes.domain.model.News
import com.android.farrunytimes.domain.model.NewsInfo
import com.android.farrunytimes.presentation.adapter.NewsAdapter
import com.android.farrunytimes.presentation.vm.AppViewModelFactory
import com.android.farrunytimes.presentation.vm.NewsListViewModel
import javax.inject.Inject

/**
 *   Created by Mohd Farhan on 25/03/2021.
 */
class NewsListFragment : BaseFragment() {


    private var binding : FragmentNewsListBinding? = null

    @Inject
    lateinit var appViewModelFactory: AppViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =  FragmentNewsListBinding.inflate(inflater, container, false)
        loaderView = binding?.loading;
        return binding?.root;
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val newsListViewModel = ViewModelProviders.of(this,appViewModelFactory).get(NewsListViewModel::class.java)
        newsListViewModel.responseLiveData().observe(viewLifecycleOwner){
            showResult(it)
        }
        newsListViewModel.fetchNewsList()
    }


    override fun populateUi(result: Any) {
        when(result){
            is NewsInfo -> {
                binding?.itemRv?.adapter = NewsAdapter(
                    result.results,
                    this
                );
                return
            }
            is String -> {
                showMessage(result as String)
                return
            }
            else -> {
                showMessage(getString(R.string.default_error_msg))
                return
            }
        }
    }

    override fun onClick(view: View?) {
        val news = view?.tag as News
        getNavController()
            ?.navigate(NewsListFragmentDirections.actionListToDetail(news))

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        val newsListComponent = (requireContext().applicationContext as NyTimeApplication).applicationComponent.newsListComponent().create()
        newsListComponent.inject(this)
    }

}