package com.example.dghilt.car

import javax.inject.Inject

class Kia  @Inject constructor() : CarBrand{
    override fun getCarBrand(): String {
        return "Kia 2023"
    }

}