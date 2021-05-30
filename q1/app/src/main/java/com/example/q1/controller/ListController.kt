package com.example.q1.controller

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.q1.model.ListModel
import kotlin.random.Random

class ListController: ViewModel() {

    fun generateListValues() {
        Log.d(
            "_ListController",
            "Lista de 1000 valores de 1 a 9999")
        Log.d(
            "_makeRandomValues",
            "${ makeRandomItems() }")
    }

    private fun makeRandomItems(): ListModel {
        val randomNumbers = List(1000) {Random.nextInt(
            1,
            9999)
        }
        return ListModel(randomNumbers)
    }

}