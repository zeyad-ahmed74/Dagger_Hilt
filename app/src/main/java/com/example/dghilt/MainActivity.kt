package com.example.dghilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.dghilt.car.Car
import com.example.dghilt.car.FragmentA
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car1: Car

    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        car1.startCar()
        car1.battery.getVoltNum()

        Log.d("wwwwww",""+
        "\n Car 1 = "+car1+
        "\n Car 2 = "+car2+
        "\n Engine Of Car 1 = "+car1.engine+
        "\n Engine Of Car 2 = "+car2.engine+
        "\n Battery Of Car 1 = "+car1.battery+
        "\n Battery Of Car 2 = "+car2.battery+
        "\n Car Brand Of Car 1 = "+ car1.carBrand+
        "\n Car Brand Of Car 2 = "+ car2.carBrand)


//        supportFragmentManager
//            .beginTransaction()
//            .replace(R.id.fragment_container_view,FragmentA())
//            .commit()


    }
}