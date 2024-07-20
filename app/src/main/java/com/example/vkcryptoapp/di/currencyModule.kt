package com.example.vkcryptoapp.di

import com.example.vkcryptoapp.data.remote.ApiFactory
import com.example.vkcryptoapp.data.remote.ApiService
import com.example.vkcryptoapp.data.repository.CurrencyRepositoryImpl
import com.example.vkcryptoapp.domain.repository.CurrencyRepository
import com.example.vkcryptoapp.domain.usecase.api.impl.CurrencyUseCaseImpl
import com.example.vkcryptoapp.domain.usecase.api.interfaces.CurrencyUseCase
import com.example.vkcryptoapp.presentation.mvvm.HomeViewModel
import org.koin.dsl.module
import org.koin.androidx.viewmodel.dsl.viewModel

val currencyModule = module {
    single<ApiService> { ApiFactory().currencyApi }
    single<CurrencyRepository> { CurrencyRepositoryImpl(get()) }
    factory<CurrencyUseCase> { CurrencyUseCaseImpl(get()) }
    viewModel<HomeViewModel> {
        HomeViewModel(
            get()
        )
    }
}