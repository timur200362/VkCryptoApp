package com.example.vkcryptoapp.data.memory


import com.google.gson.annotations.SerializedName

data class USD(
    @SerializedName("code")
    val code: String,
    @SerializedName("value")
    val value: Int
)