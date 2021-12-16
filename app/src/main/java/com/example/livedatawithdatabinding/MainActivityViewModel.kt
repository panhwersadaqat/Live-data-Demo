package com.example.livedatawithdatabinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Created by Sadaqat Panhwer
 * https://panhwersadaqat.github.io/
 * on 12/14/21.
 */
class MainActivityViewModel : ViewModel() {
    private var counter = MutableLiveData<Int>()
    val countData : LiveData<Int>
    get() = countData

    init {
        counter.value = 0
    }

    fun updateCount() {
        counter.value = (counter.value)?.plus(1)
    }

}