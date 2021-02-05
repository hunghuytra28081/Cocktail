package com.example.cocktailapp.screen

import com.example.cocktailapp.data.model.Cocktail
import com.example.cocktailapp.data.sorce.remote.OnFetchDataJsonListener
import com.example.cocktailapp.data.sorce.repository.CocktailRepository

class MainPresenter(private val repository: CocktailRepository) : MainContract.Presenter {

    private var view: MainContract.View? = null

    override fun onStart() {
        getMovies()
    }

    override fun onStop() {}

    override fun getMovies() {
        repository.getCocktail(object : OnFetchDataJsonListener<MutableList<Cocktail>> {
            override fun onSuccess(data: MutableList<Cocktail>) {}

            override fun onError(exception: Exception?) {}

        })
    }

    override fun setView(view: MainContract.View?) {
        this.view = view
    }
}
