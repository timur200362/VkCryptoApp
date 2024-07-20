package com.example.vkcryptoapp.domain.repository

import com.example.vkcryptoapp.data.remote.response.CurrencyResponse

interface CurrencyRepository {
    suspend fun currencyConversion(currencyName: String): CurrencyResponse
}