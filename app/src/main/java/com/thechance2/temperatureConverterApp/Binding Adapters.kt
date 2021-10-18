package com.thechance2.temperatureConverterApp

import android.view.View
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter

@BindingAdapter(value = ["myColors"])
fun setMyColors(view:View, myColors: MyColors?){
    when(myColors){
        MyColors.BLUE -> view.setBackgroundColor(ContextCompat.getColor(view.context,R.color.blue))
        MyColors.GREEN -> view.setBackgroundColor(ContextCompat.getColor(view.context,R.color.green))
        MyColors.YELLOW -> view.setBackgroundColor(ContextCompat.getColor(view.context,R.color.yellow))
        MyColors.ORANGE -> view.setBackgroundColor(ContextCompat.getColor(view.context,R.color.orange))
        MyColors.RED -> view.setBackgroundColor(ContextCompat.getColor(view.context,R.color.red))
    }
}