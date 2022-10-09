package com.example.android.marsrealestate.network

import com.squareup.moshi.Json

data class MarsPropertyItem(
    val id: String,
    @Json(name = "img_src")
    val img_src: String,
    val price: Double,
    val type: String
)