package com.waether.app

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class RondomizerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewModel=ViewModelProviders.of(this).get(RondomizerViewModel::class.java)

        viewModel.rondomValue.observe(this, Observer {rondom_txt_view.text= it.toString()})

        button.setOnClickListener{
            viewModel.incrementNumber()
        }

    }
}
