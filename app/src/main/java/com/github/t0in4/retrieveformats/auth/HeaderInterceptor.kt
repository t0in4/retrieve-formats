package com.github.t0in4.retrieveformats.auth

import okhttp3.Interceptor
import okhttp3.Response

class HeaderInterceptor(val accessToken: String) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        request = request.newBuilder()
            .addHeader("Authorization", "Bearer " + accessToken)
            .build()
        return chain.proceed(request)
    }
}