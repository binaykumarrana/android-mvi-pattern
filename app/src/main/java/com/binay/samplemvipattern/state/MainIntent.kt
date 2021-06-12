package com.binay.samplemvipattern.state

/**
 * Created by Binay on 12/6/21.
 */
sealed class MainIntent {
    object FetchUser : MainIntent()
}