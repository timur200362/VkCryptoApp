package com.example.vkcryptoapp.data.remote

import okhttp3.Interceptor
import okhttp3.Response

const val TOKEN = "cur_live_E9OznABwJF6YxeVmO4QBsH716hfHXl6XbZfFHUBL"

class ApiKeyInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        val newUrl = original.url.newBuilder()
            .addQueryParameter("token", TOKEN)
            .build()

        return chain.proceed(
            original.newBuilder()
                .url(newUrl)
                .build()
        )
    }
}