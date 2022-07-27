package com.br.natanfc.filmesflix.framework.api

import com.br.natanfc.filmesflix.domain.Movie
import retrofit2.Call
import retrofit2.http.GET

interface MovieApi {

    //https://gabriel-rossi-dev.github.io/Film-Flix-Api/movieList.json

    @GET("Film-Flix-Api/movieList.json")
    fun getAllMovies() : Call<List<Movie>>

}