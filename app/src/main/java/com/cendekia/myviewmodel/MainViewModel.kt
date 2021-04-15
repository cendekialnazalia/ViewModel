package com.cendekia.myviewmodel

import androidx.lifecycle.ViewModel

//turunan kelas viewModel
class MainViewModel : ViewModel() {
    var result = 0

    fun calculate(width: String, height: String, length: String) {
        result = width.toInt() * height.toInt() * length.toInt()
    }
}