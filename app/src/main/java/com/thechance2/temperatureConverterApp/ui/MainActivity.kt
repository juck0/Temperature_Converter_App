package com.thechance2.temperatureConverterApp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.thechance2.temperatureConverterApp.R.layout.activity_main
import com.thechance2.temperatureConverterApp.databinding.ActivityMainBinding
import com.thechance2.temperatureConverterApp.viewModels.MainViewModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, activity_main)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        viewModel.temp.observe(this,{
            if (!it.isNullOrBlank()){
            binding.temperatureInCelsius.text = "${viewModel.fahrenheitToCelsius()} C"
            Log.i("shit", "onCreate: $it ")}
        })
    }
}