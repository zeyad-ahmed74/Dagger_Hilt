package com.example.dghilt.car

import javax.inject.Inject

class Bmw @Inject constructor():CarBrand {

    override fun getCarBrand(): String {

        return "Bmw X6"
    }
}