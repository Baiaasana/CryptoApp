package com.example.crypto.utils

class ResponseHandler<out T>(val status: Status, val data: T?, private val message: String?) {

    enum class Status {
        SUCCESS,
        ERROR,
        LOADING
    }

    companion object {
        fun <T> success(data: T): ResponseHandler<T> {
            return ResponseHandler(Status.SUCCESS, data, null)
        }

        fun <T> error(message: String, data: T? = null): ResponseHandler<T> {
            return ResponseHandler(Status.ERROR, data, message)
        }

        fun <T> loading(data: T? = null): ResponseHandler<T> {
            return ResponseHandler(Status.LOADING, data, null)
        }
    }

    override fun toString(): String {
        return "Result(status=$status, data=$data, message=$message)"
    }
}