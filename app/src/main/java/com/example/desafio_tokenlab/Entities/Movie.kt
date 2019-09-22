package com.example.desafio_tokenlab.Entities

import java.io.Serializable

data  class Movie(val idMovie: String,
                  val voteAverage: String,
                  val title: String,
                  val posterUrl: String,
                  val Genres: List<String>,
                  val releaseDate: String): Serializable