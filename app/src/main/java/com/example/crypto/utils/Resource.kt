package com.example.crypto.utils

sealed class Resource {
    class Success<T>(val result: T): Resource()
    class Error(val errorMessage: String): Resource()
    class Loader(val isLoading: Boolean): Resource()
}