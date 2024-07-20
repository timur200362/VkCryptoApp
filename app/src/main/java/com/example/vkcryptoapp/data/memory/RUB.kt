package com.example.vkcryptoapp.data.memory


import com.google.gson.annotations.SerializedName

data class RUB(
    @SerializedName("code")
    val code: String,
    @SerializedName("value")
    val value: Double
)