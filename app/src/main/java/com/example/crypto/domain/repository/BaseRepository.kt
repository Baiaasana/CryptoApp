package com.example.crypto.domain.repository

interface BaseRepository {

    suspend fun doNetworkCall()
}