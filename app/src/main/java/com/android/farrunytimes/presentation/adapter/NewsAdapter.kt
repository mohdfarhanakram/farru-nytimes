package com.android.farrunytimes.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.farrunytimes.databinding.RowNewsLayoutBinding
import com.android.farrunytimes.domain.model.News
import com.android.farrunytimes.utils.setImageUrl

/**
 *   Created by Mohd Farhan on 26/03/2021.
 */
class NewsAdapter  (
    private val newsList: List<News>,
    private val listener: View.OnClickListener
) : RecyclerView.Adapter<NewsAdapter.NewsVH>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsVH {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: RowNewsLayoutBinding = RowNewsLayoutBinding.inflate(layoutInflater, parent, false)
        binding.listener = listener
        return NewsVH(binding)
    }
    override fun onBindViewHolder(holder: NewsVH, position: Int) {
        holder.bind(newsList[position])
    }

    override fun getItemCount(): Int = newsList.size


    class NewsVH(binding: RowNewsLayoutBinding) :
        RecyclerView.ViewHolder(binding.getRoot()) {

        private val binding: RowNewsLayoutBinding
        fun bind(news: News ){
            binding.news = news
            if(news.mediaList?.size?:0 > 0
                && news.mediaList?.get(0)?.metaDataList?.size?:0>0){
                val imageUrl = news.mediaList?.get(0)?.metaDataList?.get(0)?.url
                binding.userIV.setImageUrl(imageUrl)
            }
            binding.executePendingBindings()
        }
        init {
            this.binding = binding
        }
    }

}