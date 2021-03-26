package com.android.farrunytimes.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.annotation.Nullable
import com.android.farrunytimes.databinding.FragmentNewsDetailBinding
import com.android.farrunytimes.domain.model.News
import com.android.farrunytimes.utils.setImageUrl

/**
 *   Created by Mohd Farhan on 25/03/2021.
 */
class NewsDetailFragment : BaseFragment() {
    private var binding : FragmentNewsDetailBinding? = null

    private lateinit var news : News;

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =  FragmentNewsDetailBinding.inflate(inflater,container,false)
        arguments?.let {
             news = NewsDetailFragmentArgs.fromBundle(it).news
        }

        return binding?.root;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.news  = news
        if(news.mediaList?.size?:0 > 0
            && news.mediaList?.get(0)?.metaDataList?.size?:0>0){
            val imageUrl = news.mediaList?.get(0)?.metaDataList?.get(0)?.url
            binding?.userIv?.setImageUrl(imageUrl)
        }
    }

  /* override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val callback: OnBackPressedCallback =
            object : OnBackPressedCallback(true ,*//* enabled by default *//*) {
                override fun handleOnBackPressed() {
                    //getNavController()?.navigate(NewsDetailFragmentDirections.actionDetailToList())
                    getNavController()?.navigateUp()
                }
            }
        requireActivity().onBackPressedDispatcher.addCallback(this, callback)

    }*/

    override fun onClick(view: View?) {

    }
}