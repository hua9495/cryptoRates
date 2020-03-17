package com.leonov_dev.cryptorates.service.client

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientGenerator {

    private const val API_BASE_URL = "https://api.coingecko.com/api/v3/"

    private val okHttpClientBuilder = OkHttpClient.Builder()

    private val retrofitBuilder = Retrofit.Builder()
        .baseUrl(API_BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())

    fun <S> createClient(serviceClass: Class<S>): S {
        okHttpClientBuilder.interceptors().add(RequestInterceptor())

        val httpClient = okHttpClientBuilder.build()

        val retrofit = retrofitBuilder
            .client(httpClient)
            .build()

        return retrofit.create(serviceClass)
    }
}
