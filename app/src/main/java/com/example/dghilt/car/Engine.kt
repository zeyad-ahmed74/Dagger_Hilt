package com.example.dghilt.car

import dagger.hilt.android.scopes.ActivityRetainedScoped
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityRetainedScoped
class Engine @Inject constructor(){

    fun start():String = "Start Engine"
}