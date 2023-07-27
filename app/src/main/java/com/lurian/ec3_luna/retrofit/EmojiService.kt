package com.lurian.ec3_luna.retrofit

import com.lurian.ec3_luna.modal.Emojis
import retrofit2.http.GET

interface EmojiService {
    @GET("all")
    suspend fun getAllEmojis(): List<Emojis>
}
