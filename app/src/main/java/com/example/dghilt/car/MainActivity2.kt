package com.example.dghilt.car

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.dghilt.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity2 : AppCompatActivity() {

    @Inject
    lateinit var car3: Car
    @Inject
    lateinit var car4: Car



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)





        Log.d("xxxxxxx",""+car3.carBrand.getCarBrand())
        Log.d("xxxxxxx",""+car3.plateNum)
        Log.d("xxxxxxx",""+car3.carColor)


        Log.d("wwwwww",""+
                "\n Car 3 = "+car3+
                "\n Car 4 = "+car4+
                "\n Engine Of Car 3 = "+car3.engine+
                "\n Engine Of Car 4 = "+car4.engine+
                "\n Battery Of Car 3 = "+car3.battery+
                "\n Battery Of Car 4 = "+car4.battery+
                "\n Car Brand Of Car 3 = "+ car3.carBrand+
                "\n Car Brand Of Car 4 = "+ car4.carBrand)




    }
}