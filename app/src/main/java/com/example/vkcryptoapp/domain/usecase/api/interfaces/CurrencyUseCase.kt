package com.example.vkcryptoapp.domain.usecase.api.interfaces

import com.example.vkcryptoapp.data.remote.response.CurrencyResponse

interface CurrencyUseCase {
    suspend operator fun invoke(currencyName: String): CurrencyResponse
}