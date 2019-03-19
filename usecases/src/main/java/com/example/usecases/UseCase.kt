package com.example.usecases

import android.arch.lifecycle.ComputableLiveData
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData

fun randomNumberGenerator() = Math.random() * 1000

fun numberIncrementer(liveData: MutableLiveData<Int>,incrementBy: Int =1){
    val oldval=liveData.value ?:0
    liveData.postValue(oldval+incrementBy)
}