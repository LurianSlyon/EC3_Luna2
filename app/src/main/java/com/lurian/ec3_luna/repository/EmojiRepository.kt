package com.lurian.ec3_luna.repository

import com.lurian.ec3_luna.EmojiServiceResult
import com.lurian.ec3_luna.modal.Emojis
import com.lurian.ec3_luna.response.ListEmojiResponse
import com.lurian.ec3_luna.retrofit.RetrofitHelper
import java.lang.Exception
class EmojiRepository {
    suspend fun getEmojis(): EmojiServiceResult<List<Emojis>> {
        return try {
            val response = RetrofitHelper.emojiService.getAllEmojis()
            EmojiServiceResult.Success(response)
        } catch (e: Exception) {
            EmojiServiceResult.Error(e)
        }
    }
}
