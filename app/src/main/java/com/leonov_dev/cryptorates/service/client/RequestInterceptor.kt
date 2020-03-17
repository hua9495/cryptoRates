package com.leonov_dev.cryptorates.service.client

import okhttp3.Interceptor

class RequestInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): okhttp3.Response {
        val request = chain.request()
        val url = request.url()
            .newBuilder()
            .build()
        val builder = request.newBuilder().url(url)
        return chain.proceed(builder.build())
    }
}
