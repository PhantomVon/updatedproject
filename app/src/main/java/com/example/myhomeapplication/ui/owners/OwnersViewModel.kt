package com.example.myhomeapplication.ui.owners

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OwnersViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is owners Fragment"
    }
    val text: LiveData<String> = _text
}