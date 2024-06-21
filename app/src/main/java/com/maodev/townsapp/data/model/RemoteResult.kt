package com.maodev.townsapp.data.model


import com.google.gson.annotations.SerializedName

data class RemoteResult(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("login")
    val login: String,
    @SerializedName("option")
    val option: String
)