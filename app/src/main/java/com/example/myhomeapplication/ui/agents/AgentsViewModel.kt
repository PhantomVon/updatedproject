package com.example.myhomeapplication.ui.agents

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AgentsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is agents Fragment"
    }
    val text: LiveData<String> = _text
}