package com.lurian.ec3_luna.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://emojihub.yurace.pro/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val emojiService: EmojiService = retrofit.create(EmojiService::class.java)
}
