package com.example.cocktailapp.data.sorce.remote

interface OnFetchDataJsonListener<T> {

    fun onSuccess(data: T)
    fun onError(exception: Exception?)
}
