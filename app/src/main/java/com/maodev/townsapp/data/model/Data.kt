package com.maodev.townsapp.data.model


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("dane")
    val dane: String,
    @SerializedName("nombre")
    val nombre: String
)

data class TownDTO(
    @SerializedName("User")
    val User: String,
    @SerializedName("Password")
    val Password: String,
    @SerializedName("option")
    val option: String
)