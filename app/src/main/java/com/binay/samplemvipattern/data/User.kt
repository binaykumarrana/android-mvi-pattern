package com.binay.samplemvipattern.data

import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Created by Binay on 12/6/21.
 */
data class User(
    @SerializedName("id") val id: Int = 0,
    @SerializedName("title") val name: String = "",
    @SerializedName("description") val desc: String = "",
    @SerializedName("banner_url") val avatar: String = "",
) : Serializable