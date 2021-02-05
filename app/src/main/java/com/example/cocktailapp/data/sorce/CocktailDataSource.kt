package com.example.cocktailapp.data.sorce

import com.example.cocktailapp.data.model.Cocktail
import com.example.cocktailapp.data.sorce.remote.OnFetchDataJsonListener

interface CocktailDataSource {
    /**
     * Local
     */
    interface Local

    /**
     * Remote
     */
    interface Remote {
        fun getCocktail(listener: OnFetchDataJsonListener<MutableList<Cocktail>>)
    }
}
