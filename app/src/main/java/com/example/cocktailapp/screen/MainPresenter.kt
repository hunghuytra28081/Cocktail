package com.example.cocktailapp.screen

class MainPresenter : MainContract.Presenter {
    private var view: MainContract.View? = null

    override fun onStart() {
    }

    override fun onStop() {}

    override fun setView(view: MainContract.View?) {
        this.view = view
    }
}
