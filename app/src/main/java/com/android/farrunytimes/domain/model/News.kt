package com.android.farrunytimes.domain.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


/**
 *   Created by Mohd Farhan on 24/03/2021.
 */
@Parcelize
data class News (
        @SerializedName("id") val id : String,
        @SerializedName("url") val url : String,
        @SerializedName("title") val title : String,
        @SerializedName("byline") val byLine : String,
        @SerializedName("type") val type : String,
        @SerializedName("published_date") val publishedDate : String,
        @SerializedName("updated") val updated : String,
        @SerializedName("section") val section : String,
        @SerializedName("source") val source : String,
        @SerializedName("media") val mediaList : List<Media>?
): Parcelable