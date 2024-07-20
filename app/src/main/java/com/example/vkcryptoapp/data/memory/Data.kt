package com.example.vkcryptoapp.data.memory

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("USD")
    val uSD: USD,
    @SerializedName("EUR")
    val eUR: EUR,
    @SerializedName("BTC")
    val bTC: BTC
)