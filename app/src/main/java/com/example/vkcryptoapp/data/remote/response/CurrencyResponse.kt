package com.example.vkcryptoapp.data.remote.response

import com.example.vkcryptoapp.data.memory.Data
import com.example.vkcryptoapp.data.memory.Meta
import com.google.gson.annotations.SerializedName

data class CurrencyResponse(
    @SerializedName("data")
    val data: Data,
    @SerializedName("meta")
    val meta: Meta
)