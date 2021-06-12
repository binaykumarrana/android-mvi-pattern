package com.binay.samplemvipattern.domain

import com.binay.samplemvipattern.data.ApiHelper

/**
 * Created by Binay on 12/6/21.
 */
class MainRepository(private val apiHelper: ApiHelper) {
    suspend fun getUsers() = apiHelper.getUsers()
}