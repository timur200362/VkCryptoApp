package com.example.vkcryptoapp.data.remote

import com.example.vkcryptoapp.data.remote.response.CurrencyResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("currencies={currencyName}&base_currency=RUB")
    suspend fun loadCurrency(@Path("currencyName") currencyName: String): CurrencyResponse
}