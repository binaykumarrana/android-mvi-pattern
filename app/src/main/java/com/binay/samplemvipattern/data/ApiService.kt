package com.binay.samplemvipattern.data

import retrofit2.http.GET

/**
 * Created by Binay on 12/6/21.
 */
interface ApiService {
    @GET("carousell_news.json")
    suspend fun getUsers(): List<User>
}