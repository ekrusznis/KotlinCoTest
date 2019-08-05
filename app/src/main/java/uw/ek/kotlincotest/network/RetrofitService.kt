package uw.ek.kotlincotest.network

import retrofit2.Response
import retrofit2.http.GET
import uw.ek.kotlincotest.model.Post

interface RetrofitService{

    @GET("/posts")
    suspend fun getPosts(): Response<List<Post>>

}