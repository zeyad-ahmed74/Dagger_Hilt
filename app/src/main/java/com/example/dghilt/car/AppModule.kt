package com.example.dghilt.car

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Singleton
    @Provides
    fun provideBattery() = Battery()

    @carColor
    @Provides
    fun provideCarColor() = "Black"

    @plateNum
    @Provides
    fun providePlateNum() = "Adb 369"


//    @Provides
//    fun provideCarBrand():CarBrand = Bmw()

//    @Binds
//    abstract fun bindCarBrand(bmw: Bmw):CarBrand

}