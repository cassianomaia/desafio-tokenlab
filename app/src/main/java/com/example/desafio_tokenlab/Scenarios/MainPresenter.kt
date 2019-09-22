package com.example.desafio_tokenlab.Scenarios

import com.example.desafio_tokenlab.Entities.MovieList
import com.example.desafio_tokenlab.Network.RetrofitInitializer
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainPresenter(val view: MainContract.View) : MainContract.Presenter {

    override fun onLoadList(){

        view.showLoading()

        val movieService = RetrofitInitializer().createMovieSerice()

        val call = movieService.getMovies()

        call.enqueue(object: Callback<MovieList> {
            override fun onFailure(call: Call<MovieList>, t: Throwable) {
                view.hideLoading()
                view.showMessage("Falha na conexão. Você está sem internet D:")
            }

            override fun onResponse(call: Call<MovieList>, response: Response<MovieList>) {
                view.hideLoading()
                if (response.body() != null) {
                    view.showList(response.body()!!.Movies)
                } else {
                    view.showMessage("Filmes não disponiveis.")
                }
            }
        })
    }

}