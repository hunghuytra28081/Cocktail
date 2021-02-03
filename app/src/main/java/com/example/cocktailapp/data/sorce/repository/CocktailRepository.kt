package com.example.cocktailapp.data.sorce.repository

import com.example.cocktailapp.data.model.Cocktail
import com.example.cocktailapp.data.sorce.CocktailDataSource
import com.example.cocktailapp.data.sorce.remote.OnFetchDataJsonListener

class CocktailRepository private constructor(
    private val remote: CocktailDataSource.Remote,
    private val local: CocktailDataSource.Local
) {

    fun getCocktail(listener: OnFetchDataJsonListener<MutableList<Cocktail>>) {
        remote.getCocktail(listener)
    }
}
