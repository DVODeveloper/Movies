package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {


    @GET("v1.4/movie?token=KV88ECC-VJX4WV9-GPJBJ29-KCW80XW&field=rating.kp&search=7-10&limit=30")
    Single<MovieResponse> loadMovies(@Query("page") int page);

    @GET("v1.4/movie/{idFilms}?token=KV88ECC-VJX4WV9-GPJBJ29-KCW80XW")
    Single<TrailerResponse> loadTrailers( @Path("idFilms") int idFilms);

    @GET("v1/review?token=KV88ECC-VJX4WV9-GPJBJ29-KCW80XW")
    Single<ReviewResponse> loadReviews(@Query("movieId") int idFilms);
}
