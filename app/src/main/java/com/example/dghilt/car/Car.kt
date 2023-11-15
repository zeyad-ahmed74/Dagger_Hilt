package com.example.dghilt.car

import android.content.Context
import android.util.Log
import com.example.dghilt.R
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
import javax.inject.Named

@ActivityScoped
class Car @Inject constructor(
    val engine: Engine,
    val battery: Battery,
    @KiaBrand val carBrand: CarBrand,
    @carColor val carColor : String,
    @plateNum val plateNum : String,
    @ApplicationContext val appcontext : Context,
    @ActivityContext val context: Context

    ){

    fun printCarBrand(){
        Log.d("sssss",carBrand.getCarBrand())
    }

    fun startCar(){
        Log.d("sssss",engine.start())
        Log.d("sssss","Car Starting")
        Log.d("sssss",""+appcontext.getString(R.string.app_name))
        Log.d("sssss",""+context.getString(R.string.hello_blank_fragment))


    }

    fun flashLights(){
        Log.d("sssss","Flash is Lighting")

    }

}