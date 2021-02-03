package com.example.cocktailapp.screen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cocktailapp.R
import com.example.cocktailapp.data.model.Cocktail

class MainActivity : AppCompatActivity(), MainContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onGetCocktailSuccess(cocktail: MutableList<Cocktail>) {}

    override fun onError(exception: Exception?) {}
}
