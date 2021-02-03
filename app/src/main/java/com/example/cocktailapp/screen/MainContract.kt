package com.example.cocktailapp.screen

import com.example.cocktailapp.data.model.Cocktail
import com.example.cocktailapp.utils.BasePresenter
import java.lang.Exception

interface MainContract {

    /**
     * View
     */
    interface View {
        fun onGetCocktailSuccess(cocktail: MutableList<Cocktail>)
        fun onError(exception: Exception?)
    }

    /**
     * Presenter
     */
    interface Presenter : BasePresenter<View>  {
        fun getMovies()
    }
}
