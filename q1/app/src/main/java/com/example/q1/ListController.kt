package com.example.q1

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class ListController: ViewModel() {

    fun generateListValues() { Log.e("_makeRandomValues", "${ makeRandomItems() }")}

    private fun makeRandomItems(): ListModel {
        val randomNumbers = List(1000) {Random.nextInt(1, 9999) }
        return ListModel(randomNumbers)
    }

}