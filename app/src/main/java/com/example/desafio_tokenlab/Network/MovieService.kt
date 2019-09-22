package com.example.desafio_tokenlab.Network

import com.example.desafio_tokenlab.Entities.MovieList
import retrofit2.http.GET
import retrofit2.Call

interface MovieService {

    @GET("movies")
    fun getMovies(): Call<MovieList>
}