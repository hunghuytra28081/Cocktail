package com.example.cocktailapp.utils

interface BasePresenter<T> {
    
    fun onStart()
    fun onStop()
    fun setView(view: T?)
}
