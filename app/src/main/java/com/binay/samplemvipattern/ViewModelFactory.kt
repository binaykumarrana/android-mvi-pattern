package com.binay.samplemvipattern

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.binay.samplemvipattern.data.ApiHelper
import com.binay.samplemvipattern.domain.MainRepository
import com.binay.samplemvipattern.ui.MainViewModel

/**
 * Created by Binay on 12/6/21.
 */
class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}