package com.example.vkcryptoapp.presentation.mvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.vkcryptoapp.domain.usecase.api.interfaces.CurrencyUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class HomeViewModel(
    private val currencyUseCase: CurrencyUseCase
) : ViewModel() {
    private val _resultConversion = MutableStateFlow("")
    val resultConversion: StateFlow<String>
        get() = _resultConversion

    fun conversion(currencyName: String) {
        viewModelScope.launch {
            val currencyConversion = currencyUseCase(currencyName)

            when(currencyName) {
                "USD" -> _resultConversion.update { currencyConversion.data.uSD.value.toString() }
                "EUR" -> _resultConversion.update { currencyConversion.data.eUR.value.toString() }
                "BTC" -> _resultConversion.update { currencyConversion.data.bTC.value.toString() }
            }
        }
    }
}