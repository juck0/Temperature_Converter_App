package com.thechance2.temperatureConverterApp.viewModels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.thechance2.temperatureConverterApp.MyColors
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    val color = MutableLiveData<MyColors>()
      val temp = MutableLiveData<String>()
   // val temp: LiveData<Double>
      //  get() = _temp
   val display = MutableLiveData<String>()



     fun fahrenheitToCelsius() : Double? {
         Log.i("shit", "fahrenheitToCelsius:${display.value} ")
        return  ((temp.value?.toDouble()?.minus(32))?.div(1.8))
    }

    init {
        viewModelScope.launch {
            display.postValue(temp.value)
        }
        Log.i("shit", ": viewModel ${display.value}")
    }

//  //  fun changeColor(){
//        when(temp.value){
//            0.0 -> color.postValue(MyColors.BLUE)
//            0.0-20.0 -> color.postValue(MyColors.GREEN)
//            21.0-30.0 -> color.postValue(MyColors.YELLOW)
//            31.0-40.0 -> color.postValue(MyColors.ORANGE)
//            40.0 -> color.postValue(MyColors.RED)
//
//        }
//
//
//    }

}