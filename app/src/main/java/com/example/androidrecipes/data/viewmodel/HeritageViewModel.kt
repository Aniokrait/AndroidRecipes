package com.example.androidrecipes.data.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HeritageViewModel @Inject constructor(): ViewModel() {
    private val _description = mutableStateOf("")
    val description = _description

    init {
        delayLoadDetail()
    }

    private fun delayLoadDetail() {
        viewModelScope.launch {
            // 3秒待つ
            delay(3000)
            _description.value = "This is a heritage site."
        }
    }
}