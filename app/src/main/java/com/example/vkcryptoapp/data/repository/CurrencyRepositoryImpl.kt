package com.example.vkcryptoapp.data.repository

import com.example.vkcryptoapp.data.remote.ApiService
import com.example.vkcryptoapp.data.remote.response.CurrencyResponse
import com.example.vkcryptoapp.domain.repository.CurrencyRepository

class CurrencyRepositoryImpl(
    private val apiService: ApiService
) : CurrencyRepository {
    override suspend fun currencyConversion(currencyName: String): CurrencyResponse {
        return apiService.loadCurrency(currencyName)
    }
}