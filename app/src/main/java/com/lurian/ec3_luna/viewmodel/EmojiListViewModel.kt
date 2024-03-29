package com.lurian.ec3_luna.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lurian.ec3_luna.EmojiServiceResult
import com.lurian.ec3_luna.modal.Emojis
import com.lurian.ec3_luna.repository.EmojiRepository
import com.lurian.ec3_luna.retrofit.RetrofitHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
class EmojiListViewModel : ViewModel() {
    private val _emojis: MutableLiveData<List<Emojis>> = MutableLiveData()
    val emojis: LiveData<List<Emojis>> get() = _emojis

    fun getAllEmojis() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = EmojiRepository().getEmojis()
                if (response is EmojiServiceResult.Success) {
                    _emojis.postValue(response.data!!)
                } else if (response is EmojiServiceResult.Error) {
                    _emojis.postValue(emptyList())
                }
            } catch (e: Exception) {
                _emojis.postValue(emptyList())
            }
        }
    }
}
