package com.example.crypto.domain.model

data class UserModel(
    val firstName: String? = "",
    val lastName: String? = "",
    val email: String? = "",
    val balance: Double? = 0.0,
)
