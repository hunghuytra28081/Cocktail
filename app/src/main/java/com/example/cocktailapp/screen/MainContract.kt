package com.example.cocktailapp.screen

import com.example.cocktailapp.utils.BasePresenter

interface MainContract {
    interface View {}

    interface Presenter : BasePresenter<View>  {
    }
}
