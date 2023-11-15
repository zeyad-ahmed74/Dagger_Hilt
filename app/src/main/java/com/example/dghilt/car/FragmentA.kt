package com.example.dghilt.car

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dghilt.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class FragmentA : Fragment() {

    @Inject
    lateinit var car5 : Car

    @Inject
    lateinit var car6 : Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d("eeeeeee",""+
                "\n Car 5 = "+car5+
                "\n Car 6 = "+car6+
                "\n Engine Of Car 5 = "+car5.engine+
                "\n Engine Of Car 6 = "+car6.engine+
                "\n Battery Of Car 5 = "+car5.battery+
                "\n Battery Of Car 6 = "+car6.battery+
                "\n Car Brand Of Car 5 = "+ car5.carBrand+
                "\n Car Brand Of Car 6 = "+ car6.carBrand)
    }

}