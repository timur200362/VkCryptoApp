package com.example.vkcryptoapp.domain.usecase.api.impl

import com.example.vkcryptoapp.data.remote.response.CurrencyResponse
import com.example.vkcryptoapp.domain.repository.CurrencyRepository
import com.example.vkcryptoapp.domain.usecase.api.interfaces.CurrencyUseCase

class CurrencyUseCaseImpl(
    private val currencyRepository: CurrencyRepository
) : CurrencyUseCase {
    override suspend fun invoke(currencyName: String): CurrencyResponse {
        return currencyRepository.currencyConversion(currencyName)
    }
}