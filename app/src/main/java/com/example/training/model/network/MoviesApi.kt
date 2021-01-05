package com.example.training.model.network

import com.example.training.model.Movie
import retrofit2.Call
import retrofit2.http.GET

const val BASE_URL = "https://api.themoviedb.org/3/movie/"

interface MoviesApi{
    @GET("popular")
    fun getPopularMovies():Call<List<Movie>>
}