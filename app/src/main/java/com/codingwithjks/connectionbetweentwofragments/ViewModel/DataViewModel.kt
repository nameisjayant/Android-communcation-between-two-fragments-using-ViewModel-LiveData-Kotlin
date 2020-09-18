package com.codingwithjks.connectionbetweentwofragments.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DataViewModel : ViewModel() {
    val data:MutableLiveData<Int> = MutableLiveData()

    fun setData(response:Int)
    {
        data.value=response
    }
}