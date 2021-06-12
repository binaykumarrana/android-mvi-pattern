package com.binay.samplemvipattern.data

/**
 * Created by Binay on 12/6/21.
 */
interface ApiHelper {
    suspend fun getUsers(): List<User>
}