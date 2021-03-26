package com.android.farrunytimes.utils

import android.view.View
import android.widget.ImageView
import com.android.farrunytimes.R
import com.bumptech.glide.Glide

/**
 *   Created by Mohd Farhan on 26/03/2021.
 */


fun ImageView.setImageUrl(url: String?){

    Glide.with(context)
        .load(url)
        .placeholder(R.mipmap.ic_launcher)
        .error(R.mipmap.ic_launcher)
        .into(this);

}

fun View.show(){
    visibility = View.VISIBLE
}

fun View.hide(){
    visibility = View.GONE
}