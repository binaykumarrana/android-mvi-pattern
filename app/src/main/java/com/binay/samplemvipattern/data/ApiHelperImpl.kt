package com.binay.samplemvipattern.data

/**
 * Created by Binay on 12/6/21.
 */
class ApiHelperImpl(private val apiService: ApiService) : ApiHelper {
    override suspend fun getUsers(): List<User> {
        return apiService.getUsers()
    }
}