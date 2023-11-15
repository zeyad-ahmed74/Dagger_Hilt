package com.example.dghilt.car

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton


class Battery @Inject constructor(){

    // for View

    fun getVoltNum() {
        Log.d("sssss","Voltage Num = 220 V")
    }
}