package com.example.dghilt.car

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent


@Module
@InstallIn(ActivityComponent::class)
abstract class CarBrandModule {

    @BmwBrand
    @Binds
    abstract fun bindsBmwCar(bmw: Bmw):CarBrand

    @KiaBrand
    @Binds
    abstract fun bindsKiaCar(kia: Kia):CarBrand

}