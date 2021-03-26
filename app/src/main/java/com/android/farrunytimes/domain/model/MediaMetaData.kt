package com.android.farrunytimes.domain.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

/**
 *   Created by Mohd Farhan on 26/03/2021.
 */
@Parcelize
data class MediaMetaData (
    @SerializedName("url") val url : String?,
):Parcelable