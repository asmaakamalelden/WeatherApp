package com.waether.app

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.usecases.Ticker
import com.example.usecases.randomNumberGenerator

private const val DEFAULT_VALUE = 0
private const val INCREMENT_VALUE = 1

class RondomizerViewModel : ViewModel() {

    private val ticker = initializerTicker()
    var rondomValue = MutableLiveData<Int>()


    init {
        rondomValue.value = DEFAULT_VALUE   //on main thread
        ticker.start()

    }

    private fun initializerTicker()= Ticker {

//            val oldvalue = rondomValue.value ?: DEFAULT_VALUE
//            rondomValue.postValue(oldvalue + INCREMENT_VALUE)
              rondomValue.postValue(randomNumberGenerator().toInt())
    }




    override fun onCleared() {
        super.onCleared()
        ticker.cancel()
    }


}
