package com.example.androidrecipes.data.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HeritageViewModel @Inject constructor(): ViewModel() {
    private val _description = mutableStateOf("")
    val description = _description

    private val _quicDescription = MutableStateFlow("")
    val quickDescription = _quicDescription.asStateFlow()

    init {
        notDelayLoadDetail()
        delayLoadDetail()
    }

    private fun notDelayLoadDetail() {
        CoroutineScope(Dispatchers.IO).launch {
            _quicDescription.value = "This is a heritage site."
        }
    }

    private fun delayLoadDetail() {
        viewModelScope.launch {
            // 3秒待つ
            delay(3000)
            _description.value = "This is a heritage site."
        }
    }
}