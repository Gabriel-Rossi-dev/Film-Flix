package com.br.natanfc.filmesflix.api

import com.br.natanfc.filmesflix.model.Movie
import retrofit2.http.GET

interface MovieApi {

    //https://gabriel-rossi-dev.github.io/Film-Flix-Api/movieList.json

    @GET("Film-Flix-Api/movieList.json")
    fun getAllMovies() : List<Movie>

}