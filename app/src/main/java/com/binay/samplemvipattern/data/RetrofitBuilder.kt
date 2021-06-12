package com.binay.samplemvipattern.data

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Binay on 12/6/21.
 */
object RetrofitBuilder {
    private const val BASE_URL = "https://storage.googleapis.com/carousell-interview-assets/android/"
    private fun getRetrofit() = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .build()

    val apiService: ApiService =
        getRetrofit().create(ApiService::class.java)
}