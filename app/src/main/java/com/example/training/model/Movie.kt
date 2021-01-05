package com.example.training.model

import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("poster_path")
    val posterPath:String,
    @SerializedName("poster_path")
    val
    val id:String,
    val title:String,
    val vote_average: Double,
    val vote_count:Int)
