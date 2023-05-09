package com.example.myhomeapplication.ui.houses

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HousesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is houses Fragment"
    }
    val text: LiveData<String> = _text
}