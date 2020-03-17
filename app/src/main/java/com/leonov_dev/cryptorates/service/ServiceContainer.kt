package com.leonov_dev.cryptorates.service

import com.leonov_dev.cryptorates.service.client.Client
import com.leonov_dev.cryptorates.service.client.ClientGenerator

object ServiceContainer {
    // TODO: Create instance of services here
    init {
        // TODO: Pass this into services and use it
        val client = ClientGenerator.createClient(Client::class.java)
    }
}
