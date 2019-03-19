package com.waether.app

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.usecases.Ticker
import com.example.usecases.numberIncrementer
import com.example.usecases.randomNumberGenerator
 const val DEFAULT_VALUE = 0

class RondomizerViewModel : ViewModel() {

    var rondomValue = MutableLiveData<Int>()


    init {
        rondomValue.value = DEFAULT_VALUE   //on main thread
    }

    fun incrementNumber() {
        numberIncrementer(rondomValue)
    }
}
