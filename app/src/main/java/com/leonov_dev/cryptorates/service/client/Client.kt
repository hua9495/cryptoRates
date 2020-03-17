package com.leonov_dev.cryptorates.service.client

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Client {
    // TODO: Change the type to new object
    @GET("markets")
    suspend fun fetchMarkets(
        @Query("vs_currency") currency: String
    ): Response<String>
}
