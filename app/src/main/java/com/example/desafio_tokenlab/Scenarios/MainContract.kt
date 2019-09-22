package com.example.desafio_tokenlab.Scenarios

import com.example.desafio_tokenlab.Entities.Movie

interface MainContract {
    interface View{
        fun showList(movies: List<Movie>)
        fun showMessage(mensagem: String)
        fun hideLoading()
        fun showLoading()
    }

    interface Presenter{
        fun onLoadList()
    }
}