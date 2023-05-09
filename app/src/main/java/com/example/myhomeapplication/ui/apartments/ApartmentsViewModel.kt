package com.example.myhomeapplication.ui.apartments

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ApartmentsViewModel: ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is apartments Fragment"
    }
    val text: LiveData<String> = _text
}