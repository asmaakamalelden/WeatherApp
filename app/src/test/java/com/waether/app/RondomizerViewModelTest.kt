package com.waether.app

import android.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test



class RondomizerViewModelTest{
    @JvmField
    @Rule
    val instantExecutorRule = InstantTaskExecutorRule()


    @Test
    fun initThenUpdateNumberLiveDataToZero(){
        //initial value numberlivedata is default
        //Arrange
        //Act
        val viewModel= RondomizerViewModel()
        //Asset
        val result= viewModel.rondomValue.value
        Assert.assertTrue(result==DEFAULT_VALUE)
    }

    @Test
    fun incrementNumberWhenNumberLiveDataValueIsZerothenupdateNumberLiveDataValueToOne(){
        //when i invoce incrementNumber(),numberlivedataa was incremented by one

        //Arrange
        val viewModel=RondomizerViewModel()
        viewModel.rondomValue.value=0
        //Act
        viewModel.incrementNumber()
        //Asset
        val result= viewModel.rondomValue.value
        Assert.assertTrue(result==1)
    }
}