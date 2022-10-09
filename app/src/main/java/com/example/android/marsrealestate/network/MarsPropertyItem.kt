package com.example.android.marsrealestate.network

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MarsPropertyItem(
    val id: String,
    @Json(name = "img_src")
    val img_src: String,
    val price: Double,
    val type: String
):Parcelable{
    val isRental
    get() = type == "rent"
}