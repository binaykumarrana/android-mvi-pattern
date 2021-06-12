package com.binay.samplemvipattern.state

import com.binay.samplemvipattern.data.User

/**
 * Created by Binay on 12/6/21.
 */
sealed class MainState {
    object Idle : MainState()
    object Loading : MainState()
    data class Users(val user: List<User>) : MainState()
    data class Error(val error: String?) : MainState()
}